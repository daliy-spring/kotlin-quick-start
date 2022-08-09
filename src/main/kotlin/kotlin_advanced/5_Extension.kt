package kotlin_advanced

fun String.first() : Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

//실행 가능
fun MyExample.printMessage(message: String) = println(message)

//실행 안됌
fun MyExample.printMessage() = println("확장함수 출력")


 fun MyExample?.printNullOrNotNull() {
    if(this==null) println("널인 경우에만 출력")
    else println("널이 아닌 경우에만 출력")
 }

fun main() {

    var myExample: MyExample? = null

    //안전연산자 사용안해도 되는 이유 -> 내부에서 null에 대한 처리를 하고 있기 때문에, 컴파일러는 이 확장 함수가 null인 경우에도 npe가 발생하지 않음을 알고 있다.
    myExample.printNullOrNotNull()


    myExample = MyExample()
    myExample.printNullOrNotNull()



    MyExample().printMessage()
    MyExample().printMessage("hi")
    println("ABCD".first())
    println("ABCD".addFirst('Z'))
}

