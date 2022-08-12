package kotlin_advanced

// 수신 객체의 프로퍼티를 구성하고, 수신 객체의 결과를 그대로 반환할 때 사용한다.

fun main() {
    DatabaseClient().apply{
        url = "localhost:3306"
        username = "root"
        password = "1234"
        connect()
    }.connect().run{
        println(this)
     }

}