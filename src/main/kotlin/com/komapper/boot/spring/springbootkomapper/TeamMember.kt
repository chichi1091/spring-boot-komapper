package com.komapper.boot.spring.springbootkomapper

import org.komapper.annotation.KomapperAutoIncrement
import org.komapper.annotation.KomapperEntityDef
import org.komapper.annotation.KomapperId

data class TeamMember(
    val id: Int? = null,
    val teamId: Int,
    val memberId: Int,
)

@KomapperEntityDef(TeamMember::class)
data class TeamMemberDef(
    @KomapperId
    @KomapperAutoIncrement
    val id: Nothing,
)