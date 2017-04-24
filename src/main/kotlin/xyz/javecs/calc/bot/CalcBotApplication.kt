package xyz.javecs.calc.bot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class CalcBotApplication

@RestController
class HealthCheck {
    @RequestMapping("/_ah/health")
    fun healthy() = "Still surviving."
}

fun main(args: Array<String>) {
    SpringApplication.run(CalcBotApplication::class.java, *args)
}
