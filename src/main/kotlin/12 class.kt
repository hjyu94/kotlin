fun main() {
    val obj1:TestClass1 = TestClass1()
    val obj2:TestClass1 = TestClass1()
    val obj3 = obj1

    println("obj1: $obj1")
    // obj1: TestClass1@5b2133b1 (해쉬코드)
    println("obj2: $obj2")
    println("obj3: $obj3")

    val obj4 = TestClass2()
    println("obj4: $obj4")

    val obj5 = TestClass3()
    println("obj5.a1: ${obj5.a1}, obj5.a2: ${obj5.a2}")

    // obj5.a1 = 100 // val 변경 불가능
    obj5.a2 = 200
    println("obj5.a1: ${obj5.a1}, obj5.a2: ${obj5.a2}")

    obj5.testMethod1()
}

class TestClass1 {

}

class TestClass2 // 클래스 내부에 아무것도 없으면 괄호도 없어도 된다.

class TestClass3 {
    // 멤버 변수
    val a1 = 0 // 컴파일 하면 getter 만들어짐
    var a2 = 0 // 컴파일 하면 getter, setter 만들어짐

    // 멤버 메서드
    fun testMethod1() {
        println(">> testMethod1")
    }
}