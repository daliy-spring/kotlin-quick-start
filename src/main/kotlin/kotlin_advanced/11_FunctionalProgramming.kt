package kotlin_advanced



fun forEach(collection: Collection<String>, action: (String) -> Unit) {
    for(item in collection) {
        action(item)
    }
}

fun arg1(block: (String) -> Unit) {}
fun arg2(block : (String, String) -> Unit) {}
fun upperCase2(str:String) = str.uppercase()
val upperCase3: (String) -> String = {
    it.uppercase()
}
fun main() {

     arg1 {
         println(it)
     }
    arg2 { a, b ->
        println(a +  b)
    }

//    val list = mutableListOf(printHello)
//    val func = list[0]
//    call(func)
//    println(plus(1,3))
    val list = listOf("a", "b", "C")
//    val printStr : (String) -> Unit = { println(it) }
//    forEach(list, printStr)
//
    val upperCase : (String) -> String = {it.uppercase()}
    println(list.map(upperCase3))

    outerFunc()()

    //후행 람다 전달
    //함수의 마지막 인자가 함수인 경우 사용 가능
//    val list = listOf("a", "b", "C")
//    val printStr : (String) -> Unit = { println(it) }
//    forEach(list) {
//        println(it)
//    }


    //람다 레퍼런스
    // val callReference : () -> Unit = { printHello()}
    val callReference = ::printHello

    callReference()()



    val numberList = listOf("1","2","3")

//    numberList.map {
//        it.toInt()
//    }.forEach { println(it) }
//

    numberList.map(String::toInt).forEach(::println)


}

val printHello: () -> Unit = { println("hello") }
fun outerFunc() : () -> Unit = { println("익명함수") }
val outerFunc2 : () -> (() -> Unit) = { innerFunc }


val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
val sum2 = {a: Int, b: Int -> a + b}

val innerFunc: () -> Unit = {
    println("test")
}


val printMessage: (String) -> Unit = {message: String -> println(message) }
val printMessage2  = { message: String -> println(message) }
val printMessage3: (String) -> Unit = {message -> println(message) }
val printMessage4: (String) -> Unit = { println(it) }
//val func: () -> String = { "ee" }
fun printNo(){
    println("No!")
}
fun call(block : () -> Unit) =  block()

val plus: (Int, Int) -> Int = { a,b -> a  + b}







