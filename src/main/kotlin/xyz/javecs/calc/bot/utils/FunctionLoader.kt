package xyz.javecs.calc.bot.utils

import com.google.common.io.Resources
import org.springframework.stereotype.Component
import xyz.javecs.tools.expr.Function

@Component
class FunctionLoader {
    fun read(name: String): Function {
        val resource = Resources.getResource("functions/$name.txt")
        val lines = Resources.toString(resource, Charsets.UTF_8).split(System.lineSeparator())
        return Function(lines.first(), lines.subList(1, lines.size).toTypedArray())
    }
}
