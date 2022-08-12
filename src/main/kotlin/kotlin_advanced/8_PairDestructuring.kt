package kotlin_advanced

/*

튜플은 불변한 순서가 있는 객체의 집합으로서 형식이 다른 원소를 한데 묶어 다른 함수에 건네주는 불변성 자료구조이다. 함수형에서는 모든 데이터들이
 불변해야 하므로 원시데이터를 제외한 객체나 배열같은 데이터 구조를 사용하기 보다는 이렇게 불변성이 유지될 수 있는 자료구조를 사용하기를 권장한다.
 */

// f((1,3)) = 1 + 3 = 4
// 위와같이 함수에 하나의 인자로서 들어온 것을 튜플이라 한다.
//fun plus(a: Int, b: Int) = a + b

fun plus(tuple: Tuple) = tuple.a + tuple.b
data class Tuple(val a: Int, val b: Int)

// 코틀린에서는 Tuple과 비슷한 Pair가 있다. Pair은 불변이다.
fun plus2(pair: Pair<Int, Int>) = pair.first + pair.second


// 세개의 요소 => Triple



fun main () {
//    println(plus(1,3))
    val plus = plus(Tuple(1,2))
    val plus2 = plus2(Pair(1,3))



    // first, second is val
     val pair = Pair("a",1)
    //pair.first = "1" -> error!
     val newPair = pair.copy(first = "B")

    val second = newPair.component2()


    //Immutable List
    val list = newPair.toList()
    println(list)
    println(plus2)


    val triple = Triple("A", "B", "C")
    val newTriple = triple.copy(third="c")
    println(triple)


    // 구조분해할당 -> 내부적으로 componentN 함수를 사용한다.
    val (a,b,c)= triple;

    println("$a $b $c")




    val list2 = newTriple.toList()

    val (a1,a2,a3)=  list2
    println("$a1 $a2 $a3")



    // to => Pair(key, value) 로 치환 가능
    val map = mutableMapOf("이하늘" to "leesky")
    for((key, value ) in map) {
        println("${key}의 영어 이름은 ${value}")
    }
}