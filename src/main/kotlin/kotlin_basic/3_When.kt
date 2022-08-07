package kotlin_basic
fun main() {

    //자바 코드(switch)를 코틀린의 when식으로 변환한 코드
    val day = 2
    val result= when(day) {
        1 -> "월"
        2 -> "화"
        3 -> "수"
        4 -> "목"
        else -> "기타"
    }
    println(result)

    // else를 생략할 수 있다.
    when(getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        else -> println("blue")
    }
    // 여러개의 조건을 콤마로 구분해 한줄에서 정의할 수 있다.
    when(getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("0 또는 1이 아님")
    }
}
fun getNumber() = 2

fun getColor() = Color.RED

enum class Color {
    RED, GREEN, BLUE
}