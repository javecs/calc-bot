package xyz.javecs

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import xyz.javecs.api.greetings
import kotlin.test.assertEquals

@RunWith(SpringRunner::class)
@SpringBootTest
class CalcBotApplicationTests {

	@Test fun evalAdd() {
		assertEquals("Hello, world", greetings("world"))
	}

}
