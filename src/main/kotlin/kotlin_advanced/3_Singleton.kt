package kotlin_advanced

import java.time.LocalDateTime

//singleton 생성 -> object 키워드 사용
//object Singleton {
//    val a = 1234
//
//    fun printA() = println(a)
//}
//
//fun main() {
//    println(Singleton.a)
//    Singleton.printA()
//}




//
//object DatetimeUtils {
//    val now: LocalDateTime
//        get() = LocalDateTime.now()
//
//    //const 는 java의 상수와 유사
//    const val DEFAULT_FORMAT = "YYYY-MM-DD"
//
//    fun same(a:LocalDateTime, b: LocalDateTime) : Boolean {
//        return a == b
//    }
//}
//
//fun main() {
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//
//
//    println(DatetimeUtils.DEFAULT_FORMAT)
//
//    val now = LocalDateTime.now()
//    println(DatetimeUtils.same(now, now))
//
//}
//

//companion 키워드를 사용해 클래스 내부에 객체 선언을 사용할 수 있다 = 동반 객체
class MyClass {

    private constructor()

    //동반 객체, 이름 지정 가능
    companion object MyCompanion{
        val a = 1234
        fun newInstance() = MyClass()
    }
}

fun main() {
    println(MyClass.a)
    println(MyClass.newInstance())

    println(MyClass.MyCompanion.a)
    println(MyClass.MyCompanion.newInstance())

}
