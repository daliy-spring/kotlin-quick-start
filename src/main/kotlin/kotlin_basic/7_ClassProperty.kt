/*
    객체지향에서 상태는 프로퍼티로 행위는 메서드로 나타낸다.
    하지만 자바는 상태를 메서드로 표현하는 경우가 많다.
    코틀린은 프로퍼티로 상태를 명확히 표현한다.
 */

class Coffee constructor(
    var name: String ="", // var 사용 가능, 기본값 사용 가능
    var price: Int = 0,// trailing comma
    //var로 선언한 property는 기본적으로 getter, setter 가 존재
    //val은 getter만 있음
    //custom getter, setter 생성 가능
    ){
    //custom getter
    val brand: String
        get() = "스타벅스"

    val region: String
        get() {
            return "경기도 안양시 만안구"
        }

    var quantity: Int = 0
        set(value) {
            if(value > 0) {
                //field로 quantity의 참조에 접근 (backing field에 접근)
                //프로퍼티에 직접 할당하면, quantity setter에 대한 무한 재귀로 인해 스택 오버 플로 발생함
                field = value
            }
        }
}

// 기본 생성자 constructor 키워드 생략 가능
// 특정 어노테이션을 사용하는 경우 constructor 키워드 같이 사용
class A (val name: String){}

// 클래스 본문 생략 가능
class EmptyClass

fun main() {
    val coffee = Coffee()
    //내부적으로 getter, setter 사용한 것임!
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000

    //custom setter
    coffee.quantity = 1


    println("남은 수량 ${coffee.quantity}")



    println("${coffee.brand} ${coffee.region}점 ${coffee.name} 가격은 ${coffee.price}")




}
