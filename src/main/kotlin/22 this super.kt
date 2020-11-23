/*
    # this
    - 객체 자기 자신을 지칭
    - 생성자에서 다른 생성자를 호출할 때 사용(보조 생성자에서 주 생성자를 호출하는 등)
*/

fun main() {
    var obj1 = Class22_1()
    obj1.method()
    printDivider()

    var obj2 = SubClass22_1()
    obj2.subMethod()
}

class Class22_1() {
    var a1 = 100
    fun method() {
        var a1 = 200
        println("a1: $a1")
        println("this.a1: ${this.a1}")
    }
}

/*****************************************************************/

// 주 생성자가 있을 때 보조 생성자는 반드시 주 생성자를 호출하는 형태로 만들어야 한다.
class Class22_2(var a1:Int) {
    constructor() : this(10) { }
}

/*****************************************************************/

open class SuperClass22_1 {
    open var a1 = 100
}

class SubClass22_1 : SuperClass22_1() {
    override var a1 = 1000 // 부모 변수를 재정의
    fun subMethod() {
        println("a1: $a1")
        println("this.a1: ${this.a1}")
        println("super.a1: ${super.a1}")
    }
}

/*****************************************************************/
// 오버라이딩 된 함수의 구분에도 super 키워드를 사용.

open class SuperClass22_2 {
    open fun method() {
        println(">> Super Class: method()")
    }
}

class SubClass22_2 : SuperClass22_2() {
    override fun method() {
        println(">> Sub Class: method()")
    }
    fun test() {
        super.method()
        method()
        this.method()
    }
}

fun test22_2() {
    val obj = SubClass22_2()
    obj.test()
}

/*****************************************************************/
// 부모 클래스의 기본 생성자가 없고, 자식 클래스에서 보조 생성자만 사용하는 경우
// 자식의 보조 생성자에서 super 키워드를 이용해서 부모 클래스의 생성자를 호출 할 수 있다.
// (자식 생성자가 호출되면 부모의 생성자먼저 호출된다.)

open class SuperClass22_3(val a1:Int)
// class SubClass22_3 : SuperClass22_3() { } // Error
class SubClass22_3 : SuperClass22_3 {
    constructor(a1:Int) : super(a1) {}
    constructor(a1:Int, a2:Int) : super(a1) {}
    constructor(a1:Int, a2:Int, a3:Int) : super(a1) {}
}