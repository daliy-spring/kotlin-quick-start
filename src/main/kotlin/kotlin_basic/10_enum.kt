
/*
enum 클래스 -> 열거형 클래스

생성자, 프로퍼티 정의 가능

 */

interface Payable {
    fun isPayable(): Boolean
}


enum class PaymentsStatus(val label: String ): Payable {
    UNPAID("미지급") {
        override fun isPayable(): Boolean = true
    },
    PAID("지급완료") {
        override fun isPayable(): Boolean = false

    },
    FAILED("지급실패") {
        override fun isPayable(): Boolean = false

    },
    REFUNDED("환불"){
        override fun isPayable(): Boolean = false
    }; //세미콜론
    //    fun isPayable() = false
}

fun main() {
//    if(PaymentsStatus.UNPAID.isPayable()) {
//        println("결제 가능 상태")
//    }

    // valueOf 인자로 들어온 스트링을 가지고, 상수와 일치하는 것을 찾아서 인스턴스화를 시켜줌
    val paymentsStatus = PaymentsStatus.valueOf("PAID")
    println(paymentsStatus.label)

    if(paymentsStatus == PaymentsStatus.PAID) {
        println("결제 완료 상태")
    }

    // 상수들의 리스트를 가져올 수 있음
    for (status in PaymentsStatus.values()) {
        println("${status}의 label : ${status.label}")
    }

    // 상수에 두가지 기본 프로퍼티가 존재
    for(status in PaymentsStatus.values()) {
        //ordinal => 순서
        println("${status.name}, ${status.ordinal}")
    }


}