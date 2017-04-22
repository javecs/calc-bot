package xyz.javecs.calc.bot.test

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import xyz.javecs.tools.expr.Calculator
import kotlin.test.assertEquals

@ActiveProfiles("test")
@RunWith(SpringRunner::class)
@SpringBootTest
class CalculatorTest {

	@Autowired
	lateinit var calculator: Calculator

	@Test fun calc1() {
		assertEquals(1.60934, calculator.eval("miles2km(1)").value)
	}

}
