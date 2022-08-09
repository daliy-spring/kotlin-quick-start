package kotlin_advanced


class MyGenerics<out T>(val t: T) {

}

class Bag<T> {
    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>
    ) {
        to.addAll(from)
    }
}

fun main() {
    val bag = Bag<String>()

    // 반공변성 사용
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3","4"))

//    val generics = MyGenerics<String>("test")
//    //type arguments 생략
//    val generics2 = MyGenerics(1)
//
//
//    // 변수의 타입에 제네릭을 사용한 경우
//    val list1: MutableList<String> = mutableListOf()
//
//    //타입 아규먼트를 생성자에서 추가
//    val list2 = mutableListOf<String>()
//
//    val list3 : List<*> = listOf<String>("test")
//
//    val list4 : List<*> = listOf<Int>(1,2,3,4)
//

    //변성 : 제네릭에서 파라미터화된 타입이 서로 어떤 관계에 있는 지 설명하는 개념
    // 반공변성, 공변성, 무공변성으로 나뉜다.
    // PECS(Producer- Extends, Consumer-Super)
    // 공변성은 자바 제네릭의 extends, 코틀린에선 out
    // 반공변성은 자바 제네릭에서 super, 코틀린에선 in

    val generics = MyGenerics<String>("test")

    // 아래처럼 불가능이지만 공변성을 통해 해결
     val charGenerics : MyGenerics<CharSequence> = generics


}