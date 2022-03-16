package com.komapper.boot.spring.springbootkomapper

import org.komapper.annotation.KomapperAutoIncrement
import org.komapper.annotation.KomapperEntityDef
import org.komapper.annotation.KomapperId

data class Team(
    val id: Int? = null,
    val name: String,
)

@KomapperEntityDef(Team::class)
data class TeamDef(
    @KomapperId
    @KomapperAutoIncrement
    val id: Nothing,
)