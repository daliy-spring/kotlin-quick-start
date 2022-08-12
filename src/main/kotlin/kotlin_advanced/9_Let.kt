package kotlin_advanced
/*
    객체의 컨텍스트 내에서 코드 블록을 실행하기 위해서 존재하는 몇가지 함수가 포함되어 있는데 이를 스코프 함수라고 한다.
    수신자 객체에 접근할 수 있기 때문에 변수명을 사용하지 않고도 객체에 접근가능
    수신자 객체는 람다식 내부에서 사용할 수 있는 객체의 참조이다.
    스코프 함수를 사용하면 수신자 객체에 대한 참조로 this 또는 it을 사용한다.

    let ,also => it
    run, with, apply => this

    let, run, with => 함수의 결과 반환
    apply, also => 컨텍스트 객체(수신자 객체) 반환

    let,run,apply,also => 확장 함수

    with => 확장 함수 아님



    this는 키워드이다. (변수명으로 사용 불가능)
    it은 소프트 키워드이다. (변수명으로 사용 가능)

 */

fun main() {
    //let은 null이 아닌 경우 사용, 새로운 결과를 반환할 때 사용

    val str: String? = "hello, world!"

    val result: Int? = str?.let {
        //null 아닌 경우에만 동작
        println(it)

        // scope 함수가 길어지면 콜백 헬이 생길 수 있다.
//        val abc: String? = "abc"
//        abc?.let {
//            val def: String? = "def"
//            def?.let {
//                println("abcdef가 null이 아님")
//            }
//        }
        val abc: String?  ="abc"
        val def: String? = "def"
        if(!abc.isNullOrBlank() && !def.isNullOrBlank()) {
            println("abcdef가 null이 아님")
        }
        2134
    }

    println(result)


    val hello: String = "hello"
    val hi: String = "hi"

    //it으로 인한 혼란을 막기 위해서, 중첩 스코프 함수 자제, 혹은 -> 화살표 사용
    hello.let {a: String ->
        println(a.length)

        hi.let { b: String ->
            println(b.length)
        }
    }



}
