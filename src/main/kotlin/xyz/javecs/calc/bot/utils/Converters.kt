package xyz.javecs.calc.bot.utils

private val operators = HashMap<String, String>().apply {
    put("掛ける", "*")
    put("かける", "*")
    put("足す", "+")
    put("たす", "+")
    put("割る", "/")
    put("わる", "/")
    put("引く", "-")
    put("ひく", "-")
    put("곱하기", "*")
    put("더하기", "+")
    put("나누기", "/")
    put("빼기", "-")
}

fun textToOperator(text: String): String {
    var replaced = text.toLowerCase()
    for ((key, value) in operators) {
        replaced = replaced.replace(key, value)
    }
    return replaced
}