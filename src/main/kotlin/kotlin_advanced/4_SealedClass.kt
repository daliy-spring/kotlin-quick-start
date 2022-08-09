package kotlin_advanced

import javax.print.attribute.standard.MediaSize.Other

//하위 클래스를 제한 조건에 따라서 정의해야하고, 실드 클래스의 하위 클래스는, 컴파일러가 컴파일 시점에 판단할 수 있다.
//같은 패키지 또는 모듈(1.6 기준) 혹은 같은 파일에 있어야함
sealed class Developer {
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String): Developer() {
    override fun code(language: String) {
        println("저는 백엔드 개발자입니다. ${language}를 사용합니다.")

    }
}
data class FrontendDeveloper(override val name: String): Developer() {
    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다. ${language}를 사용합니다.")
    }
}


object OtherDeveloper : Developer() {
    override val name: String = ""
    override fun code(language: String) {
        TODO("Not yet implemented")
    }
}

object DeveloperPool {
    val pool = mutableMapOf<String,Developer>()
    fun add(developer: Developer) = when (developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지않는 개발자 종류입니다.")
    //안써도됌!
    //  else -> {
//      println("지원하지 않는 개발자입니다.")
//     }
    }
    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper(name="leesky")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name="leesky2")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("leesky"))
    println(DeveloperPool.get("leesky2"))


}






