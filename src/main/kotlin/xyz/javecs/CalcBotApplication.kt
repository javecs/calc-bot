package xyz.javecs

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import xyz.javecs.tools.expr.Calculator

@SpringBootApplication
class CalcBotApplication

@Configuration
class CalcBotConfig {
    @Bean
    fun calculator(): Calculator = Calculator()
}

fun main(args: Array<String>) {
    SpringApplication.run(CalcBotApplication::class.java, *args)
}
