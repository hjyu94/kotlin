/*
    # 정적 멤버
    - 클래스를 정의할 때 변수나 메서드를 정적 멤버로 정의하면 객체를 생성하지 않고 사용할 수 있다.
    - Java 에서 static 을 사용하는데 kotlin 은 companion 객체를 사용한다.

    - kotlin 에서 Java 의 static 멤버 사용은 다른 점이 없다.
    - 만약 kotlin 에서 정의한 companion 멤버를 .Companion 키워드 없이
    Java 에서 사용할 수 있도록 하기 위해서는 @JvmStatic 을 사용해야 한다.
*/

fun main() {
    var obj1 = TestClass25_1()
    var obj2 = TestClass25_1()

    // obj1.companion_a // X
    // obj2.companion_fun() // X

    TestClass25_1.companion_a
    TestClass25_1.companion_fun1()

    // 코틀린에서 자바 클래스 사용하기
    var obj3 = _25_companion()
    println("obj3.javaA1: ${obj3.nonstatic_a}")
    obj3.nonstatic_method()

    _25_companion.static_a
    _25_companion.static_method()
}

class TestClass25_1 {
    var a = 100 // member field

    fun fun1() { // member function
        println("a: $a")
        println("companion_a: $companion_a")
        companion_fun1()
    }

    companion object {
        var companion_a = 200
        fun companion_fun1() {
            // println("a: a") // X
            println("a2: $companion_a")
            // fun1() // X
        }

        @JvmStatic var companion_b = 200
        @JvmStatic fun companion_fun2() {}
    }
}