/*
    # kotlin heritage 코틀린 상속
    - 부모 클래스는 open 키워드를 사용해야만 상속 받을 수 있다.
    - open 키워드를 사용하지 않으면 자바 코드로 변경 될 때 final 키워드가 붙는다.
 */

fun main() {
    test14_1()
}

/**********************************************/

open class SuperClass1 // 부모 클래스의 경우 open 키워드 붙이기!

// 자식 클래스에서는 부모 클래스의 생성자를 반드시 호출해야 한다!
// class SubClass1 : SuperClass { } // X
class SubClass1 : SuperClass1() { }

class SubClass2 : SuperClass1 {
    constructor() : super()
}

/**********************************************/

// 파라매터를 받는 생성자를 만들면 기본 생성자는 사라진다.
open class SuperClass2(var a1:Int) {
    var superMember = 100
    fun superMethod() {
        println(">> SuperClass 의 메서드")
    }
}

// 만약 부모 클래스가 기본 생성자가 없는 경우 에러가 난다.
// [error] no value password for parameter 'a1'
// class SubClass3 : SuperClass2() { }

class SubClass3 : SuperClass2(100) {
    val subMember = 200

    fun subMember() {
        println(">> SubClass 의 메서드")
    }
}

fun test14_1() {
    var s1 = SubClass3()
    println("s1.subMember: ${s1.subMember}")
    s1.subMember()
    println("s1.superMember: ${s1.superMember}")
    s1.superMethod()
}

/**********************************************/

open class SuperClass4(val a1: Int)

class SubClass4 : SuperClass4 {
    // 보조 생성자에서 super 키워드를 이용해서 부모의 생성자를 호출하는 방법도 있다.
    constructor() : super(100)
}
