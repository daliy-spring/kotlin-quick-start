package kotlin_advanced

import java.util.ArrayList
import java.util.LinkedList



fun main() {
    // immutable
    // list factory 함수
    val currencyList = listOf("달러", "유로", "원")

    //currencyList.add("") 불가능


    // mutable
    val mutableCurrencyList = mutableListOf<String>().apply {
        //이렇게도 가능
        add("달러")
        add("유로")
        add("원")
    }

//    mutableCurrencyList.add("달러")
//    mutableCurrencyList.add("유로")
//    mutableCurrencyList.add("원")


    //immutable set
    val numberSet = setOf(1,2,3,4)

    // mutable set
    val mutableNumberSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    //immutable map
    // 중위 함수(infix)
    val numberMap = mapOf("one" to 1, "two" to 2)

    //mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2
    //위처럼 하는게 추천
    mutableNumberMap.put("three", 3)


    /*
    코틀린에서는 컬렉션 빌더를 제공,
    좀 더 쉽게 컬렉션 생성 가능
    내부에선 mutable 반환은 immutable로 사용 가능
     */
    val numberList = buildList {
        add(1)
        add(2)
        add(3)
    }


    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
    addLast(1)
}

println(linkedList)


// arrayList
val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }



    val iterator = currencyList.iterator()

    while(iterator.hasNext()) {
        println(iterator.next())
    }

    println("========================")

    //for in
    for(currency in currencyList) {
        println(currency)
    }

    println("========================")

    currencyList.forEach {
        println(it)
    }

    println("========================")
    //for loop -> map
    val lowerList = listOf("a", "b", "c")
    //val upperList = mutableListOf<String>()
//
//    for(lowerCase in lowerList) {
//        upperList.add(lowerCase.uppercase())
//    }
//
    val upperList = lowerList.map {it.uppercase()}
//    println(upperList)

//    val filteredList = mutableListOf<String>()
//    for(upperCase in upperList) {
//        if(upperCase == "A" || upperCase == "C") {
//            filteredList.add(upperCase)
//        }
//    }

    val filteredList = upperList.filter { it == "A" || it == "B"}
    println(filteredList)

    //코틀린에는 asSequence로 java8 스트림과 유사하게 동작함

    val filteredList2 = upperList
        .asSequence()
        .filter { it == "A" || it == "B"}
        .toList() //terminal operator

    // 인라인 함수의 갯수만큼 컬렉션이 생성된다.
    // 대량의 데이터를 다룬다고 하면, 컬렉션을 만드는 것은 메모리를 낭비함
    // 5만건 10만건 이하면 시퀀스 api가 오히려 별로
}