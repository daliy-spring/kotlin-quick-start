package kotlin_advanced

import java.lang.Exception


/*
코틀린은 try-catch를 통한 예외처리외에도 함수형 스타일의 Result 패턴 을 구현한
runCatching 을 제공한다
Result 패턴이란 함수가 성공하면 캡슐화된 결과를 반환하거나 예외가 발생하면 지정한 작
업을 수행하는 패턴이다
 */

fun getStr():Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main() {
//    val result = try {
//        getStr()
//    } catch (e: Exception) {
//        println(e.message)
//        "기본값"
//    }
//    println(result)
//    val result = runCatching { getStr() }
//        .getOrElse {
//            println(it.message)
//            "기본값"
//        }

//    val result = runCatching { "성공" }.getOrNull()
//
//      val result: Throwable?  = runCatching { getStr() }
//          .exceptionOrNull()
//
//      result?.let {
//          println(it.message)
//          throw it
//      }

    //val result = runCatching { getStr() }.getOrDefault("기본값")
//    val result = runCatching { getStr() }.getOrElse {
//        println(it.message)
//        "기본 값"
//    }

//    val result = runCatching { getStr() }.getOrThrow()
//    val result: String = runCatching { "안녕" }
//        .map {
//            "${it}하세요"
//        }.getOrThrow()


//    val result2 = runCatching { "안녕" }
//        .mapCatching {
//            throw Exception("예외")
//        }.getOrDefault("기본 값")





    val result = runCatching { getStr() }
        .recoverCatching { throw Exception("예외") }
        .getOrDefault("복구")


    println(result)

    //println(result2)
}
