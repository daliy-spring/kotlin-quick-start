package kotlin_advanced

// 데이터를 보관하거나 전달하기 위해 만듬 -> DTO
// 컴파일러가 자동으로 만들어주는 함수들이 있다.
// jdk 15 -> record
/*
    데이터를 저장하는 목적으로 만드기 때문에
    toString, hashCode, equals 직접 재정의가 가능

    equals: 객체 동등성 비교 (두개 인스턴스 동등성 비교)
    hashCode: equals를 재정의할때, hashcode도 재정의해야함
        - equals가 true를 반환하면, hashcode도  true여야함
        - equals가 true지만, hashcode가 false면 hash 계열 자료구조에서 정상동작 하지 않음
    toString: 객체를 문자열로 표현
    copy: 객체 불변성을 쉽게 유지 가능
        - 불변성을 보장하지 않으면 hash 자료구조에서 의도치않은 동작이 가능
    componentN
 */



        data class Person(val name: String, val age: Int) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as Person

                if (name != other.name) return false
                if (age != other.age) return false

                return true
            }

            override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}
//
//class Person(val name: String, val age: Int)
//

fun main() {
    val person1 = Person(name = "leesky", age =23);
//    val person2 = Person(name = "leesky", age =23);
//    println(person1 == person2) //false 지만 data class의 동등성 비교는 equals를 자동으로 생성해서 true가 나옴
//
//    println(person1.toString()) //data class가 아니면 이상한 주소값 나옴
//

    val (name, age) = person1
    println("이름 = ${name}, 나이= ${age}")
    println("이름=${person1.component1()}, 나이=${person1.component2()}")

//    val person2 = person1.copy(name="strange")
//    println(person2)
//
//
//    val set = hashSetOf(person1)
//
//    println(set.contains(person1)) //false => hashcode 재정의해야함(equals 재정의시)

//    person1.name= "strange"
//    println(set.contains(person1)) //false => 불변성이 깨짐

}

