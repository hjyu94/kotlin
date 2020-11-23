/*
    # 추상 메서드와 추상 클래스
    - 추상 메서드는 구현되지 않는 메서드를 의미함.
    - 추상 클래스는 추상 메서드를 하나라도 가지고 있는 클래스를 의미
    - 추상 클래스는 객체를 생성할 수 없다.

    # 추상 클래스의 객체를 생성하는 법
    - 자식 클래스에서 상속받아 추상 메소드를 구현해야만 한다.
    - 추상 클래스는 자식 클래스에서 메서드를 오버라이딩 해서 사용하기 위함이다.
*/

fun main() {

}

open class Super23_1 {
    fun method1() {
        println(">> Super: method1()")
    }
    open fun method2() {
        println(">> Super: method2()")
    }
}

class Sub23_1 : Super23_1() {
    override fun method2() {
        println(">> Sub: method2()")
    }
}

fun testFun23_1(obj: Super23_1) {
    obj.method1()
    obj.method2()
}