package kotlin_advanced

// 부수 작업을 수행하거나, 전달받은 수신객체를 결과로 반환할 때 사용

class User(val name: String, val password: String) {

    fun validate() {
        if(name.isNotEmpty() && password.isNotEmpty()) {
            println("success validate")
        } else {
            println("fail!")
        }
    }

    fun printName() = println(name)
}

fun main() {
    val user = User(name="leesky", password = "1234").also {
        it.validate()
        it.printName()
    }
}
