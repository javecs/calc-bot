package xyz.javecs.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

fun greetings(name: String): String {
    return "Hello, $name"
}

@RestController
class Hello {
    @GetMapping("/{name}")
    fun hello(@PathVariable name: String): String {
        return greetings(name)
    }
}
