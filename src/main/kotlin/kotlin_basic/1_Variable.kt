
// 탑레벨 변수 선언 가능
// 클래스 없이도 변수 선언이 가능하다.
var x = 5;


fun main() {
    x += 1
    println(x)
    val a: Int = 1

    val b = 1 // 타입 추론

    val c: Int;
    c = 3; //지연 할당


    //val d //타입 명시 안하면 혼남
    //d= 123

    //val과 var 로 선언 가능

    //val(value) => final 키워드 처럼, const 처럼 재할당 불가
    //var(variable) => 가변변수, 재할당 가능

    val d: String = "hello";
    //d = "bye"; // 불가능

    var e: String ="hello";
    e = "hi" // 가능, 하지만 타입은 맞춰야함
}