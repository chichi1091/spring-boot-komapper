package com.komapper.boot.spring.springbootkomapper

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/teams")
class TeamController(
    val teamService: TeamService
) {
    @GetMapping("/{id}")
    fun fetchId(@PathVariable("id") id: Int): ResponseEntity<TeamDTO> {
        return ResponseEntity.ok(teamService.findById(id))
    }
}
