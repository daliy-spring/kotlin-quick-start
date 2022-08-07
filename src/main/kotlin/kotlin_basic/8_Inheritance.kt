/*
코틀린의 모든 타입의 조상은 Any

- equals
- hashCode
- toString

자바와 다르게 final 클래스가 기본이다.
필요의 경우 open 키워드를 통해 상속을 한다.
 */

//상속에 열려있다.
open class Dog () {
    open var age: Int = 0
    open fun bark() {
        println("멍멍!")
    }
}

//상속
// 함수나 프로퍼티를 재정의할때도 open 키워드 사용
// 가본 생성자를 통해 더 쉽게 오버라이드 가능
//하위 클래스에서 상위 클래스에 접근하려면 super 키워드 사용

open class Bulldog(final override var age: Int = 0) : Dog() {
    //오버라이드된 프로퍼티나 함수는 자동으로 open 상태이다.
    final override fun bark() {
        println("컹컹")
        super.bark()
    }
}

//추상 클래스를 구현할때는 abstract 키워드 사용
abstract class Developer {
    //하위에서 구현해야하는 것 정의
    abstract var age: Int
    abstract fun code(language: String)

    var pay: Int = 0
        set(value) {
            field = value
        }


    fun test(): Unit {
        println("test!")
    }
}

open class BackendDeveloper(
    final override var age: Int = 0,
): Developer() {
    override fun code(language: String) {
        println("i code with $language with $pay $")
    }
}



fun main() {
    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    val backendDeveloper = BackendDeveloper(23)
    println(backendDeveloper.age)
    backendDeveloper.code("kotlin")

    backendDeveloper.test()
}