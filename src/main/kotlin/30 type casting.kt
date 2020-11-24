/*
    # 스마트 캐스팅
    - 특정 조건을 만족하면 자동으로 형변환이 발생하는 개념
    - 형 변환은 객체의 클래스 타입이 아닌 객체의 주소 값을 가지고 있는 참조 변수의 타입이 변경됨

    # as 연산자
    - 객체를 지정된 클래스 타입으로 변환하는 연산자
    - 만약 객체가 지정된 클래스 타입과 관계가 없을 경우 오류가 발생한다.
    - 형변환이 발생한 참조 변수는 변환된 타입을 유지한다.

    # is 연산자
    - 형 변환이 가능하면 반환하고 true 반환
    - if 문으로 구성해서 사용 -> if 문 안에서만 변환된 타입으로 사용
    -> if 문 밖에서는 변환되기 전의 타입으로 다시 변경됨

    # Any 타입
    - 모든 클래스가 직간접적으로 Any 클래스를 상속받는다.
    - 따라서 모든 객체의 주소 값은 Any 타입 참조 변수에 담을 수 있다.
    - Any 타입과 is 연산자를 활용하여 다양한 타입의 객체에 대응하는 코드를 만들 수 있다.

    # 기본 타입의 형 변환
    - 참조 변수의 타입이 변경되는 것이 아니라 새로운 객체게 생성되어 반환된다.
    - toBye(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
 */

open class Super30_1
interface Inter30_1

class Sub30_1 : Super30_1() {
    fun method() {}
}
class Sub30_2 : Inter30_1 {
    fun method() {}
}

fun test30_1() {
    val obj1:Sub30_1 = Sub30_1()
    val obj2:Sub30_2 = Sub30_2()

    // 부모 클래스 타입 참조 변수에 담기 (스마트 캐스팅)
    val super1:Super30_1 = obj1
    // 구현한 인터페이스 타입 참조 변수에 담기 (스마트 캐스팅)
    val inter1:Inter30_1 = obj2
    // 반대는 불가능
//    val obj3:Sub30_1 = super1
//    val obj4:Sub30_2 = inter1

    /*************************************************/

    super1 as Sub30_1 // 만약 super1 이 Sub30_1 와 관계가 없으면 오류
    inter1 as Sub30_2 // 오류 발생 가능

    super1.method()
    inter1.method()

    /*************************************************/

    val obj5:Sub30_1 = Sub30_1()
    val chk1 = obj5 is Sub30_1
    println("chk1: $chk1") // true

//    val chk2 = obj5 is Inter30_1 // Incompatible
//    println("chk2: $chk2")

    val super3:Super30_1 = obj5
    val chk3 = super3 is Sub30_1
    println("chk3: $chk3") // true

    if(super3 is Sub30_1) {
        // super3 as Sub30_1
        // 굳이 써주지 않아도 if 안에서 is 연산자를 사용하면 자동으로 스마트 캐스팅 됨
        super3.method() // O
    }
//    super3.method() // X // 밖에서는 스마트 캐스팅 이전의 타입으로 다시 변환됨

    /*************************************************/

    val obj6:Sub30_1 = Sub30_1()
    val obj7:Sub30_2 = Sub30_2()

    anyMethod(obj6)
    anyMethod(obj7)
    anyMethod(100)
    anyMethod("문자열")

    /*************************************************/

    val number1:Int = 100
    val number2:Long = number1.toLong()

    val str:String = "100"
    val number3:Int = str.toInt()
}

fun anyMethod(obj: Any) {
    if(obj is Sub30_1) {
        obj.method()
    } else if(obj is Sub30_2) {
        obj.method()
    } else if(obj is Int) {
        println("정수입니다.")
    } else if(obj is String) {
        println("문자열 입니다.")
    }
}