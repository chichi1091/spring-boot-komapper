package com.komapper.boot.spring.springbootkomapper

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/persons")
class PersonController(
    val personService: PersonService,
) {
    @GetMapping
    fun all(): ResponseEntity<List<Person>> {
        return ResponseEntity.ok(personService.findAll())
    }

    @GetMapping("/{id}")
    fun fetchId(@PathVariable("id") id: Int): ResponseEntity<Person> {
        return ResponseEntity.ok(personService.findById(id))
    }

    @PostMapping
    fun insert(@RequestBody body: Request): ResponseEntity<Void> {
        val person = personService.insert(body.name, body.email)
        val uri = URI("/${person.id}")
        return ResponseEntity.created(uri).build()
    }
}

data class Request(
    val name: String,
    val email: String,
)
