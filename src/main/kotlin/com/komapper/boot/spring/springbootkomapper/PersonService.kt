package com.komapper.boot.spring.springbootkomapper

import org.komapper.core.dsl.Meta
import org.komapper.core.dsl.QueryDsl
import org.komapper.core.dsl.query.first
import org.komapper.jdbc.JdbcDatabase
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PersonService(
    private val database: JdbcDatabase
    ) {
    fun findAll(): List<Person> {
        return database.runQuery {
            val p = Meta.person
            QueryDsl.from(p).orderBy(p.id)
        }
    }

    fun findById(id: Int): Person {
        return database.runQuery {
            val p = Meta.person
            QueryDsl.from(p).where{ p.id eq id }.first()
        }
    }

    @Transactional
    fun insert(name: String, email: String): Person {
        return database.runQuery {
            val person = Person(name = name, email = email)
            val p = Meta.person
            QueryDsl.insert(p).single(person)
        }
    }

    @Transactional
    fun update(id: Int, name: String, email: String): Person {
        return database.runQuery {
            val person = findById(id)
            val p = Meta.person
            QueryDsl.update(p).single(person.copy(name = name, email = email))
        }
    }

    @Transactional
    fun delete(id: Int) {
        database.runQuery {
            val person = findById(id)
            val p = Meta.person
            QueryDsl.delete(p).single(person)
        }
    }
}

