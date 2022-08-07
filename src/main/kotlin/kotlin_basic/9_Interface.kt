/*
인터페이스 키워드 사용
인터페이스 내부에 구현해야하는 추상함수와 자바 8의 디펄트 메서드 처럼 구현을 가진 함수를 모두 정의 가능
 */

class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Cart : Wheel {
    //인터페이스 프로퍼티 존재
    var coin: Int

    //이렇게도 가능! 하지만 내부에 프로퍼티에 대한 초기값이 따로 없어서 backing field 접근 불가
    val weight: String
        get() = "20kg"


    fun add(product: Product)
    fun rent() {
        // rent 는 Cart 내부에서 로직을 구현
        if(coin > 0) {
            println("카트를 대여합니다.")
        }
    }

    //하위 인터페이스에서 정의 가능
    override fun roll() {
        println("카트가 굴러갑니다.")
    }

    fun printId() = println("1234")
}



interface  Order {
    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }
    fun printId() = println("5678")
}




// class 였다면 : Cart()
class MyCart(override var coin: Int): Cart, Order {
    override fun add(product: Product) {
        if(coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이(가) 카트에 추가됐습니다.")

        //  함수(상위)를 super<>을 사용해서 호출
        super<Order>.add(product)

    }
    // 두개의 인터페이스에서 동일한 디펄트함수를 제공하는 경우에는 하위 클래스에서 디펄트 함수에 대해서 구현을 강제하게 된다.
    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }
}


fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product(name="장난감", price=10000))

    cart.printId()
}