package xyz.javecs.calc.bot.api

import com.linecorp.bot.model.event.Event
import com.linecorp.bot.model.event.MessageEvent
import com.linecorp.bot.model.event.message.TextMessageContent
import com.linecorp.bot.model.message.TextMessage
import com.linecorp.bot.spring.boot.annotation.EventMapping
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler
import xyz.javecs.tools.text2expr.Text2Expr

@LineMessageHandler
class Messenger {

    val text2Expr = Text2Expr()

    @EventMapping
    fun reply(event: MessageEvent<TextMessageContent>): TextMessage {
        return TextMessage(text2Expr.eval(event.message.text))
    }

    @EventMapping
    fun reply(event: Event) {
        println("event: " + event)
    }
}