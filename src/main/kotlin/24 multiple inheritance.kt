/*
    # 인터페이스
    - kotlin 은 다중 상속을 지원하지 않는다.
    - 만약 생성된 객체의 주소값을 다양한 타입의 변수에 담고 싶다면 인터페이스를 이용하면 된다.
*/

fun main() {
    val obj1 = TestClass24_1()
    val obj2 = TestClass24_2()
    testFun24_1(obj1)
    testFun24_2(obj2)

    val obj3 = TestClass24_3()
    val obj4 = TestClass24_4()
    testFun24_3(obj3)
    testFun24_4(obj4)
}

open abstract class AbstractClass1 {
    open abstract fun abstracMethod1()
}

open abstract class AbstractClass2 {
    open abstract fun abstracMethod2()
}

fun testFun24_1(obj: AbstractClass1) {
    obj.abstracMethod1()
}
fun testFun24_2(obj: AbstractClass2) {
    obj.abstracMethod2()
}

class TestClass24_1 : AbstractClass1() {
    override fun abstracMethod1() {
        println(">> TestClass24_1: abstractMethod1()")
    }
}
class TestClass24_2 : AbstractClass2() {
    override fun abstracMethod2() {
        println(">> TestClass24_2: abstractMethod2()")
    }
}

// 추상 클래스 1, 2, 3, ... 9999 의 추상 메서드를 구현하려고 하는데
// 자바는 다중 상속이 안 되니까 상속을 하나밖에 받지 못하니
// 추상 클래스 하나당 하나씩 자식 클래스를 생성해야 하는데 귀찮다
// ---> 이를 인터페이스를 이용하면 편리하게 가능.

/*
    # 인터페이스
    - 객체를 생성할 수 없다
    - 클래스는 한 개 이상의 인터페이스를 구현할 수 있다.
    - 객체는 구현한 인터페이스 형 참조 변수에 담을 수 이다.
    - 인터페이스에는 추상 메서드와 일반 메서드 모드를 구현해서 사용 할 수 있다.
    - 인터페이스는 추상 클래스와 비슷해 보이지만, 하나의 클래스에 여러 인터페이스를 구현 할 수 있는 장점이 있다.
*/

interface Inter24_1 {
    fun inter1Method1() {
        println("Inter1 : inter1Method1()")
    }
    fun inter1Method2()
}

interface Inter24_2 {
    fun inter2Method1() {
        println("Inter2 : inter2Method1()")
    }
    fun inter2Method2()
}

fun testFun24_3(obj: Inter24_1) {
    obj.inter1Method1()
    obj.inter1Method2()
}
fun testFun24_4(obj: Inter24_2) {
    obj.inter2Method1()
    obj.inter2Method2()
}

class TestClass24_3 : Inter24_1 { // abstract 를 구현하지 않으면 안 됨.
    override fun inter1Method2() {
        println("Class24_3 : inter1Method2()")
    }
}

class TestClass24_4 : Inter24_2 { // abstract 를 구현하지 않으면 안 됨.
    override fun inter2Method2() {
        println("Class24_4 : inter2Method2()")
    }
}

class TestClass24_5 : Inter24_1, Inter24_2 {
    override fun inter1Method2() {
        TODO("Not yet implemented")
    }

    override fun inter2Method2() {
        TODO("Not yet implemented")
    }
}