package xyz.javecs.calc.bot.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import xyz.javecs.tools.expr.Calculator
import xyz.javecs.calc.bot.utils.FunctionLoader

@Configuration
@ComponentScan(basePackages = arrayOf("xyz.javecs.calc.bot"))
class CalcBotConfig {
    @Autowired
    lateinit var functionLoader : FunctionLoader

    @Bean
    fun calculator(): Calculator = Calculator()
            .plugin(functionLoader.read("miles2km"))
}