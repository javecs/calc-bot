package xyz.javecs.calc.bot.test

import org.junit.Test
import xyz.javecs.calc.bot.utils.textToOperator
import kotlin.test.assertEquals

class ConvertersTest {
    @Test fun mapper1() {
        assertEquals("3*3", textToOperator("3곱하기3"))
        assertEquals("3/3", textToOperator("3나누기3"))
        assertEquals("3+3", textToOperator("3더하기3"))
        assertEquals("3-3", textToOperator("3빼기3"))
    }

    @Test fun mapper2() {
        assertEquals("3*3", textToOperator("3掛ける3"))
        assertEquals("3*3", textToOperator("3かける3"))
        assertEquals("3/3", textToOperator("3割る3"))
        assertEquals("3/3", textToOperator("3わる3"))
        assertEquals("3+3", textToOperator("3足す3"))
        assertEquals("3+3", textToOperator("3たす3"))
        assertEquals("3-3", textToOperator("3引く3"))
        assertEquals("3-3", textToOperator("3ひく3"))
    }
}
