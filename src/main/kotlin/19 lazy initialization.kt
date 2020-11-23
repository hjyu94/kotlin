/*
    # Lazy initialization 지연 초기화
    - 프로퍼티의 값을 나중에 값을 세팅하는 것 -> 지연 초기화
    - 변수를 선언할 때 값을 넣지 않고 나중에 값을 넣을 수 있다.
    - 값을 사용하기 전에 반드시 값을 넣어주기는 해야 한다.

    # lateinit
    - var 로 선언된 변수의 초기화를 뒤로 미룰 수 있다.
    - 하지만 그렇더라도 변수의 값을 사용하기 전에 초기화가 이루어져야 한다.
    (초기화 해놓고 사용해라!)
    - val 로 선언된 변수는 오류가 발생한다.

    # lazy
    - val 로 선언된 변수 -> lateinit 으로 지연 초기화 불가능 -> lazy 코드 블록을 이용한다
    - 이는 나중에 프로퍼티의 값을 세팅해준다는 의미가 아니라 사용할 때 값을 초기화한다는 의미.
    = lazy 를 이용한 변수를 한번도 사용하지 않는다면 메모리에 올리지도 않은 것. (변수 생성이 안된 것)
 */

class Class19_1 {
    // var a1: Int
    // [Error] Property must be initialized or be abstract

    var a2: Int = 100

    var a3: Int
    // init 에서라도 값을 넣어주면 에러가 발생하지 않는다.

    // var a4
    // [Error] Property must be initialized or be abstract.
    // 데이터 타입 추론 불가능해서

    init {
        a3 = 100
        // a4 = 200
    }
}

class Class19_2 {
    // @ lateinit 키워드는 primitive type 에 사용할 수 없다.
    // lateinit var a1: Int
    // [Error] 'lateinit' is not allowed on properties of primitive types

    lateinit var a2: String

    fun testMethod() {
        // :: reflection
        if(::a2.isInitialized == false) {
            a2 = "문자열"
        }
    }
}

fun test19_2() {
    println()
}

class Class19_3 {
    val a1:Int by lazy {
        println(">> a1 init")
        10
    }
    val a2:String by lazy {
        println(">> a2 init")
        "문자열"
    }
}