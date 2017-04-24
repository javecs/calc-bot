package xyz.javecs.calc.bot.test

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import kotlin.test.assertTrue

@RunWith(SpringRunner::class)
@SpringBootTest
@ActiveProfiles("test")
class CalcBotApplicationTest {
    @Test fun launched() {
        assertTrue(true)
    }
}
