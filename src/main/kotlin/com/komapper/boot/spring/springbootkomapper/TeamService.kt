package com.komapper.boot.spring.springbootkomapper

import org.komapper.core.dsl.Meta
import org.komapper.core.dsl.QueryDsl
import org.komapper.jdbc.JdbcDatabase
import org.springframework.stereotype.Service

@Service
class TeamService(
    private val database: JdbcDatabase
) {
    fun findById(id: Int): TeamDTO? {
        val g = Meta.team
        val m = Meta.teamMember
        val p = Meta.person
        val result = database.runQuery {
            QueryDsl.from(g)
                .leftJoin(m) { g.id eq m.teamId }
                .leftJoin(p) { m.memberId eq p.id }
                .where { g.id eq id }
                .orderBy(m.id)
                .select(g.id, g.name, p.id, p.name, p.email)
        }

        val members = result.map {
            Member(it[p.id]!!, it[p.name]!!, it[p.email]!!)
        }
        val member = result.first()
        val id = member[g.id]
        val name = member[g.name]

        return TeamDTO(id!!, name!!, members)
    }
}


data class TeamDTO(
    val id: Int,
    val name: String,
    val members: List<Member>,
)

data class Member(
    val id: Int,
    val name: String,
    val email: String,
)