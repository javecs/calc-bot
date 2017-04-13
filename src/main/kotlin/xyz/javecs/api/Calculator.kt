package xyz.javecs.api

import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import xyz.javecs.tools.expr.eval

data class Expression(val expr: String)
data class Value(val expr: String, val value: Number)

@RestController
class Calculator {
    @PostMapping("/calc", consumes = arrayOf(APPLICATION_JSON_VALUE), produces = arrayOf(APPLICATION_JSON_VALUE))
    fun eval(@RequestBody expression: Expression): Value {
        return Value(expression.expr, eval(expression.expr))
    }
}
