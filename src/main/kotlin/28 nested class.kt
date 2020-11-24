/*
    # 중첩 클래스
    - 내부 클래스는 외부 클래스로 맏는 객체를 통해서만 객체를 생성할 수 있다.
 */

class Outer1 {
    inner class Inner1 {

    }
}

fun outerTest() {
    val obj1 = Outer1()
    val obj2 = obj1.Inner1()
}

/*
    # 익명 중첩 클래스
    - 이름이 없는 클래스를 익명 중첩 클래스라고 부른다
    - 인터페이스나 추상 클래스를 사용할 때 이용한다.
    - 인터페이스를 구현한 클래스나 추상 클래스를 상속받은 클래스를 만듦과 동시에
      메서드를 오버라이딩 하고 객체를 새엉하는 것 까지 수행
    - 이름이 없으므로 다시는 객체를 생성할 수 없다.
 */

// 추상 클래스나, 인터페이스의 경우
// 이를 상속받거나 구현하는 클래스를 정의해야 객체를 생성 할 수 있다.
abstract class C28_1() {
    abstract fun testMethod()
}
interface Inter28_1 {
    fun interMethod()
}
class C28_2 : C28_1() {
    override fun testMethod() {
        println(">> C28_2 : tetsMethod()")
    }
}
class C28_3 : Inter28_1 {
    override fun interMethod() {
        println(">> C28_3 : tetsMethod()")
    }
}
// 근데 이 방법 이외에 익명 중첩 클래스를 사용해서 객체를 생성할 수도 있다.
fun test28_1() {
    // 중첩 클래스를 사용해서 추상 클래스 객체 생성하기
    val t1 = object : C28_1() {
        override fun testMethod() {
            TODO("Not yet implemented")
        }
    }
    t1.testMethod()

    // 중첩 클래스를 사용해서 인터페이스의 객체 생성하기
    val t2 = object : C28_1() {
        override fun testMethod() {
            TODO("Not yet implemented")
        }
    }
    t2.testMethod()
}