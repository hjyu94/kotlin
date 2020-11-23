/*
    # Any
    - Kotlin 에서 사용하는 모든 클래스의 부모 클래스
    - 어떤 클래스를 상속 받을지 명시하지 않는다면 자동으로 Any 클래스를 상속받는다
    - Any 클래스에는 모든 객체가 가지고 있어야 할 메서드가 제공되고 있으며
    이 메서드들을 오버라이딩 하여 각 클래스의 성격에 맞게 재 구현하여 사용할 수 있다.
 */

fun main() {
    val obj1 = Class21_1()
    val obj2 = Class21_2()
    val obj3 = Class21_3()

    testFun(obj1)
    printDivider()

    testFun(obj2)
    printDivider()
    
    testFun(obj3)
}

class Class21_1 {
    override fun toString(): String {
        println(super.toString())
        return "Class21_1 의 객체입니다"
    }
}
class Class21_2 {
    override fun toString(): String {
        println(super.toString())
        return "Class21_2 의 객체입니다"
    }
}
class Class21_3 {
    override fun toString(): String {
        println(super.toString())
        return "Class21_3 의 객체입니다"
    }
}

fun testFun(obj: Any) {
    println("obj: $obj")
}

