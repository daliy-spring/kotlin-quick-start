package kotlin_advanced

import kotlin.concurrent.thread


class HelloBot {

    //var 사용 금지
    private val greeting: String by lazy(LazyThreadSafetyMode.PUBLICATION) {
        getHello()
    }
    fun sayHello(){
        println(greeting)
    }
}

fun getHello() = "안녕하세요"


// 지연초기화는 대상에 대한 초기화를 미뤘다가 실제 사용시점에 초기화하는 기법을 말한다.
// 사용시점에 1회만 동작 실행

fun main(){
    val helloBot =HelloBot()

    for(i in 1..5 ){
        Thread {
            helloBot.sayHello()
        }.start()
    }


    // 지연 할당

    //helloBot.sayHello()
}