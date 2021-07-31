const val ITEM_PRICE = 100
const val DISCOUNT_START = 1000
var DISCOUNT = 100

fun main() {

    print("Введите количество: ")
    val itemCount = readLine()!!.toInt()

    print("Вы наш постоянный клиент ( да/нет )")
    val regularAnswer = readLine()

    val totalPrice = ITEM_PRICE * itemCount
    when (totalPrice) {
        in 0..100 -> DISCOUNT = 0
        in 1001..10000 -> DISCOUNT = 100
        in 10001..Int.MAX_VALUE -> DISCOUNT = (totalPrice / 100) * 5
    }
    if regularAnswer.equals("да") {
        val DISCOUNTPLUS = (DISCOUNT / 100) * 1
        println(DISCOUNT)
    }
}
