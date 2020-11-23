/*
    # 부모 클래스 타입의 변수
    - Kotlin 의 모든 객체는 부모 클래스형 참조 변수에 담을 수 있다.
    - 부모 클래스형 참조 변수를 사용하면 부모 클래스에 정의되어 있는 멤버만 사용이 가능하다
    ex) 아래에서 obj2.subA1 나 obj2.superMethod1() 사용 불가능

    # overriding
    - 부모 클래스의 메서드를 자식 클래스에서 재정의하는 개념
    - 부모 클래스에서 오버라이딩 될 메서드 앞에 open 을 붙여줘야 한다.
*/
fun main() {
    test20_3()
}

open class SuperClass20_1 {
    var superA1 = 100
    fun superMethod1(){
        println(">> superMethod1()")
    }
}

class SubClass20_1 : SuperClass20_1() {
    var subA1 = 200
    fun subMethod1() {
        println(">> subMethod1()")
    }
}

fun test20_1() {

    val obj1:SubClass20_1 = SubClass20_1()
    println("obj1.subA1: ${obj1.subA1}, obj1.superA1: ${obj1.superA1}")
    obj1.subMethod1()
    obj1.superMethod1()
    printDivider()

    // obj2.subA1 나 obj2.superMethod1() 사용 불가능
    /*
        val obj2:SuperClass20_1 = obj1
        println("obj1.subA1: ${obj2.subA1}, obj1.superA1: ${obj2.superA1}")
        obj2.subMethod1()
        obj2.superMethod1()
        printDivider()
    */
}

/***********************************************************/

/*
    # Overriding 의 효과
    - 만약 객체가 부모형 참조 변수에 담겨 있다면 부모 영역에 정의한 멤버만 사용할 수 있다.
    ex) var obj1:Super = Sub()

    - 만약 부모의 메서드를 자식에서 오버라이딩 했다면 부모의 참조 변수를 통해 자식의 메서드를 호출 가능하다.

    - 이는 이벤트 처리 방식에서 사건이 발생했을 경우 개발자가 만든 메서드를 호출하기 위해 사용하는 매우 중요한 개념!
    ex) 안드로이드는 버튼 클릭 시 이벤트 핸들러 메서드가 호출되도록 만들어 놓는다.
    개발자는 안드로이드에서 이미 만들어져 있던 '버튼클릭 인터페이스'를 오버라이딩하여
    각각의 버튼을 클릭했을 때 실행할 함수로 재정의 하여 본인이 구현하고 싶은 기능을 구현할 수 있다.
*/

open class SuperClass20_2() {
    open fun method() {
        println(">> Super Class: method()")
    }
}
class SubClass20_2 : SuperClass20_2() {
    override fun method() {
        println(">> Sub Class: method()")
    }
}

fun test20_2() {
    val obj1: SubClass20_2 = SubClass20_2()
    obj1.method()
}

/***********************************************************/

// ex) 버튼을 클릭하면 이벤트 핸들러가 호출되도록 안드로이드 OS 를 개발했다.
// 안드로이드 OS를 만들 당시에는 각 버튼 클릭 시 어떤 기능이 구현되야 하는지 알 수 없음
open class SuperClass20_3 {
    open fun method() {
        println(">> Super Class: method()")
    }
}
// 부모형 참조 변수를 파라매터로 받는 함수
fun overridingTest(obj: SuperClass20_3) {
    obj.method()
}

// ex) 버튼1 클릭 시 호출할 명령어
class SubClass20_3_1 : SuperClass20_3() {
    override fun method() {
        println(">> Sub Class 1: method()")
    }
}

// ex) 버튼2 클릭 시 호출할 명령어
class SubClass20_3_2 : SuperClass20_3() {
    override fun method() {
        println(">> Sub Class 2: method()")
    }
}

fun test20_3() {
    val obj1: SuperClass20_3 = SubClass20_3_1()
    val obj2: SuperClass20_3 = SubClass20_3_2()

    overridingTest(obj1)
    overridingTest(obj2)
}