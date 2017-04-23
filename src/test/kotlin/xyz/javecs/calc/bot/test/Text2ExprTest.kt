package xyz.javecs.calc.bot.test

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import kotlin.test.assertEquals

class Text2ExprTest {

    val text2Expr = Text2Expr()

    @Test fun calc1() {
        assertEquals("5", text2Expr.eval("3+2"))
    }

    @Test fun calc2() {
        assertEquals("9", text2Expr.eval("3掛ける3"))
    }

}
