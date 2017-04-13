package xyz.javecs.api

import com.linecorp.bot.model.event.Event
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler
import com.linecorp.bot.spring.boot.annotation.EventMapping
import com.linecorp.bot.model.message.TextMessage
import com.linecorp.bot.model.event.message.TextMessageContent
import com.linecorp.bot.model.event.MessageEvent
import xyz.javecs.tools.expr.eval

@LineMessageHandler
class Messenger {
    @EventMapping
    fun reply(event: MessageEvent<TextMessageContent>): TextMessage {
        return TextMessage(eval(event.message.text).toString())
    }

    @EventMapping
    fun reply(event: Event) {
        println("event: " + event)
    }
}