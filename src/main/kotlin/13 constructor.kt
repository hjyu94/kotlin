/*
    # init 코드 블록
    : Kotlin 은 클래스의 init 코드 블록을 만들어주면 객체 생성시 자동으로 처리되는 코드를 만들 수 있다.
    : 객체가 생성될 때 자동으로 동작해야 하는 코드는 init, 어떠한 값을 세팅하고 초기화하는 코드는 생성자에 작성한다.
    : 각 생성자 별로 중복되는 코드가 있다면 init 을 이용하면 편리하다.

    # 기본 생성자
    - 클래스 정의할 때 이름 우측에 정의하는 생성자
    - 기본 생성자의 매개 변수는 멤버 변수로 자동 등록된다.
 */

fun main() {
    var obj1 = Class13_1()
    printDivider()

    val obj2_1 = Class13_2()
    println("obj2: $obj2_1, obj2.v1: ${obj2_1.v1}, obj2.v2: ${obj2_1.v2 }")
    printDivider()

    val obj2_2 = Class13_2()
    println("obj3: $obj2_2, obj3.v1: ${obj2_2.v1}, obj3.v2: ${obj2_2.v2 }")
    printDivider()

    // val obj3 = Class13_3() // 기본생성자가 없기 때문에 컴파일 에러
    val obj3 = Class13_3(10, 20)
    printDivider()

    val obj4_1 = Class13_4(9,99)
    printDivider()

    val obj4_2 = Class13_4(999)
    printDivider()
}

fun printDivider() {
    println("--------------------------------")
}

class Class13_1 {
    init {
        println("객체가 생성되면 자동으로 동작되는 부분입니다")
    }
}

class Class13_2 {
    var v1:Int = 0
    var v2:Int = 0

    constructor() {
        println("매개 변수가 없는 생성자")
    }

    constructor(a1:Int, a2:Int) {
        println("매개 변수가 두 개인 생성자")
        v1 = a1
        v2 = a2
    }
}

// class Class13_3 -> 기본 생성자만 가진 클래스
// class Class13_3() -> 기본 생성자만 가진 클래스
// class Class13_3(a1:Int, a2:Int) -> 기본 생성자 X 매개변수 2개를 받는 생성자를 가진 클래스 O
// class Class13_3(val a1:Int, var a2:Int) -> 추가적으로 val 은 getter / var 은 getter, setter 가 만들어짐.
class Class13_3 constructor(var a1:Int, var a2:Int) // constructor 키워드는 없어도 똑같다
// 기본 생성자에 변수들을 나열하면 컴파일러가 걔들을 멤버 필드로 등록해준다.

// 주 생성자와 init 문 중 어느 게 먼저 실행 되는가?
// 아래 클래스의 객체를 생성할 때 파라매터로 넣어준 값이 아니라
// "a1: 0, a2: 0" 이 출력된다면 주 생성자보다 init 문이 먼저 실행 된 것으로 추론 가능
// ---> 주 생성자가 init 보다 먼저 실행 됨.
class Class13_4 (var a1:Int, val a2:Int) {
    init {
        println("init 코드 수행")
        println("a1: $a1, a2: $a2")
    }

    // 보조 생성자 (secondary constructor)
    // constructor(val a1: Int) { } // 보조 생성자에는 val, var 키워드를 사용 할 수 없다.

    // constructor(a1: Int) { }
    // 보조 생성자에서는 반드시 주 생성자를 호출해줘야 한다 -> this 이용!
    // [error] Primary constructor call expected.

    // 1. 주 생성자 코드 실행 Class13_4(a1, 100)
    // 2. init 실행
    // 3. 보조 생성자 괄호 안의 코드 실행
    constructor(a1: Int) : this(a1, 100) {
        println("보조 생성자 호출")
    }
}