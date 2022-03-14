package com.komapper.boot.spring.springbootkomapper

import org.komapper.annotation.KomapperAutoIncrement
import org.komapper.annotation.KomapperEntityDef
import org.komapper.annotation.KomapperId

data class Person(
    val id: Int? = null,
    val name: String,
    val email: String,
)

@KomapperEntityDef(Person::class)
data class PersonDef(
    @KomapperId
    @KomapperAutoIncrement
    val id: Nothing,
)