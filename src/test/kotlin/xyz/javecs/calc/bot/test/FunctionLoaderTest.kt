package xyz.javecs.calc.bot.test

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import xyz.javecs.calc.bot.utils.FunctionLoader
import kotlin.test.assertEquals

@ActiveProfiles("test")
@RunWith(SpringRunner::class)
@SpringBootTest
class FunctionLoaderTest {

    @Autowired
    lateinit var functionLoader: FunctionLoader

    @Test fun read1() {
        val f = functionLoader.read("hello")
        assertEquals("f", f.name)
        assertEquals("x", f.params.first())
        assertEquals("x+1", f.codes.first())
    }

}
