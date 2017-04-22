package xyz.javecs.api

import com.linecorp.bot.model.event.Event
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler
import com.linecorp.bot.spring.boot.annotation.EventMapping
import com.linecorp.bot.model.message.TextMessage
import com.linecorp.bot.model.event.message.TextMessageContent
import com.linecorp.bot.model.event.MessageEvent
import org.springframework.beans.factory.annotation.Autowired
import xyz.javecs.utils.textToOperator
import xyz.javecs.tools.expr.Calculator

@LineMessageHandler
class Messenger {

    @Autowired
    lateinit var calculator: Calculator

    @EventMapping
    fun reply(event: MessageEvent<TextMessageContent>): TextMessage {
        return TextMessage(calculator.eval(textToOperator(event.message.text)).value.toString())
    }

    @EventMapping
    fun reply(event: Event) {
        println("event: " + event)
    }
}