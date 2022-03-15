package com.komapper.boot.spring.springbootkomapper

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/groups")
class GroupController() {
    @GetMapping("/{id}")
    fun fetchId(@PathVariable("id") id: Int): ResponseEntity<Response> {
        return ResponseEntity.ok(null)
    }
}

data class Response(
    val id: Int,
    val name: String,
    val members: List<Member>,
)

data class Member(
    val idd: Int,
    val name: String,
    val email: String,
)