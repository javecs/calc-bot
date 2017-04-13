package xyz.javecs

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class CalcBotApplication

fun main(args: Array<String>) {
    SpringApplication.run(CalcBotApplication::class.java, *args)
}
