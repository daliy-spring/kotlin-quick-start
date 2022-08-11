package kotlin_advanced


// 가변 프로퍼티에 대한 지연 초기화

class LateInitTest {
    //val금지, non-null
     lateinit var text: String

     fun printText() {
         // 클래스 내부에서만 사용 가능
         if(this::text.isInitialized) {
             println("초기화됨")
         }else {
             text = "안녕하세요"
         }
         println(text)
     }

}

fun main() {

    val test = LateInitTest()
    test.printText()
}