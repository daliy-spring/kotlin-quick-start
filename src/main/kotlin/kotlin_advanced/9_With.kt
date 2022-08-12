package kotlin_advanced

// 결과 반환없이 내부에서 수신객체를 이용해서 다른 함수를 호출하고 싶을 때 사용한다.

fun main() {
    val str = "hello!"

    //확장함수가 아니다.
    val length: Int = with(str) {
        length
    }
    println(length)

}