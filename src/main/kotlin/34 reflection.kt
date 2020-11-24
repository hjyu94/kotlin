import kotlin.reflect.KClass
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.primaryConstructor

/*
    # 리플렉션
    - 프로그램 실행 중 프로그램의 구조(객체, 함수, 프로퍼티)를 분석하는 기법
    - 객체의 클래스 타입, 클래스 정보, 생성자 정보, 프로퍼티 정보 등을 실행 중에 파악 할 수 있다
 */

fun main() {
    // 클래스 타입
    val a1: KClass<String> = String::class
    val a2: Class<String> = String::class.java

    println("String type in Kotlin: $a1")
    println("String type in Java: $a2")

    /************************************************/

    val str1: String = "안녕하세요"
//    val a3: KClass<String> = str1::class // Error
    val a3: KClass<out String> = str1::class // generic
    val a4: Class<out String> = str1::class.java

    println("str1 type in Kotlin: $a3")
    println("str1 type in Java: $a4")

    /************************************************/

    val a5: KClass<*> = str1::class
    val a6: Class<*> = str1::class.java

    println("str1 type in Kotlin: $a5")
    println("str1 type in Java: $a6")

    /************************************************/

    val obj: C34_1 = C34_1()

    val a7: KClass<*> = obj::class
    val a8: Class<*> = obj::class.java

    println("obj type in Kotlin: $a7")
    println("obj type in Java: $a8")

    /************************************************/

    // ## 클래스 정보 분석
    println("추상 클래스인가? : ${obj::class.isAbstract}")
    println("Companion 클래스인가? : ${obj::class.isCompanion}")
    println("data 클래스인가? : ${obj::class.isData}")
    println("final 클래스인가? : ${obj::class.isFinal}")
    println("open 클래스인가? : ${obj::class.isOpen}")
    println("중첩 클래스인가? : ${obj::class.isInner}")
    println("sealed 클래스인가? : ${obj::class.isSealed}")

    // ## 생성자 정보 분석
    val constructors = obj::class.constructors
    // println(constructors)
    for(con in constructors) {
        println("constructor: $con")
        for(param in con.parameters) {
            println("param type:${param.type}, param index: ${param.index}")
        }
    }

    // ## 주 생성자
    val primaryCon = obj::class.primaryConstructor
    if(primaryCon != null) {
        println(primaryCon)
        for(param in primaryCon.parameters) {
            println("param type:${param.type}, param index: ${param.index}")
        }
    }

    // ## 프로퍼티
    val properties = obj::class.declaredMemberProperties
    for (prop in properties) {
        println("prop.name: ${prop.name}")
    }

    // ## 메서드 정보
    val methods = obj::class.declaredMemberFunctions
    for (met in methods) {
        println("met: ${met.name}")
    }
}

class C34_1() {
    val a:Int = 100
    val b:Int = 200
    constructor(a: Int) : this() {}
}