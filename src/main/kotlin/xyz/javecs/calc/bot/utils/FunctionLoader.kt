package xyz.javecs.calc.bot.utils

import org.apache.commons.io.FileUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.ResourceLoader
import org.springframework.stereotype.Component
import xyz.javecs.tools.expr.Function
import java.nio.charset.Charset

@Component
class FunctionLoader {
    @Autowired
    lateinit var loader: ResourceLoader

    fun read(name: String): Function {
        val resource = loader.getResource("classpath:/functions/$name.txt")
        val lines = FileUtils.readLines(resource.file, Charset.defaultCharset())
        return Function(lines.first(), lines.subList(1, lines.size).toTypedArray())
    }
}
