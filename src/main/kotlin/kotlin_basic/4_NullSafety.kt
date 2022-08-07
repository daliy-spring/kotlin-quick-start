import java.lang.NullPointerException

fun main() {
    //코틀린은 언어적 차원에서 npe의 가능성을 차단한다.


    //val a: String= null <- 에러
//    var b : String = "aabbcc"
    //b = null <- 에러

    //실제로는 100프로 널을 제거할 수 없다. -> 자바와 상호 의존하거나, Db 데이터가 null 일 수 도 있음
    // nullable 타입 제공
//    var a: String? = null

//    a.length -> null 일 수도 있습니다.

    //안전연산자를 통해 해결 npe 없이 정상적으로 사용
//    println(a?.length) // null
//    println(a) //null
//
//    val b: Int = if(a != null) a.length else 0
//    println(b)
//
//    // 더 간편하게 가능! => 엘비스(구렛나루..) 연산자
//    // 좌변이 널일 경우 우변 리턴
//    val c = a?.length ?: 0
//    println(c)
//

        val nullableStr = getNullStr()
//        val nullableStrLength = nullableStr.length // 컴파일 에러! 코틀린은 컴파일 단계에서 null 체크가 가능

        println(getLengthIfNotNull(nullableStr))

//       실제로 코틀린에서 npe가 발생 가능함
//        throw NullPointerException()

//        val c: String? = null
//        // 단언 연산자 -> 아래에서 npe 발생!
//        val d = c!!.length


    //코틀린에서 자바 코드는 null 탐지 못함!

}

fun getNullStr(): String? = null
fun getLengthIfNotNull(str: String?) = str?.length ?: 0
