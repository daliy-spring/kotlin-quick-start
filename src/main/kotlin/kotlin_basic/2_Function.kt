


// 기본
fun sum(a: Int, b: Int): Int {
    return a +b
}

// 표현식
fun sum2(a: Int, b: Int): Int = a + b

// 표현식 & 반환타입 생략
fun sum3(a: Int, b: Int) = a + b;

// 몸통이 있는 함수는 반환 타입을 제거하면 컴파일 오류
fun sum4(a: Int,b: Int) : Int {
    return a + b;
}

// 반환타입이 없는 함수는 Unit 반환한다. => 굳이 자바랑 비교하자면 void 와 유사
fun printSum(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

// 디폴트 파라미터
fun greeting(message: String = "hi!") = println(message)


//fun main() {
//    greeting("hi");
//}


// named arguments
fun log(level: String = "INFO", message: String) {
    println("[$level]$message")
}

fun main() {
    log(message ="인포 로그")
    log(level = "DEBUG", message = "디버그 로그")
    log("WARN", "워닝 로그")
    log(level="ERROR", message = "에러 로그")
}







