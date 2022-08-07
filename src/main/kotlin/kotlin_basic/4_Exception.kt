import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {

    try {
        throw Exception()
    }catch (e: Exception) {
        println("에러 발생!")
    } finally {
        println("finally 실행!")
    }

    //checked exception 을 강제하지 않음!
    //    Thread.sleep(1)

    // 트라이 캐치가 표현식임
    val a = try {
        "1234".toInt()
    } catch(e: Exception) {
        println("예외 발생 !")
    }

    println(a) // 1234


    //직접 예외 발생
    //throw Exception("예외 발생!")

   // failFast("예외 발생")

 // println("이 메시지는 출력될까?") // 도달하지 않는 코드!


    val b: String? = null
    val c =  b ?: failFast("a is null")

    // 여기서 부터는 c가 값이 있는 걸로 판단함
    println(c.length)

}

// throw를 리턴하면 nothing을 반환
// 코드가 정상적으로 실행되는 걸 보장하지 않으면 -> nothing
// 엘비스 연산자와 함께 수행하면 더 좋음!
fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}