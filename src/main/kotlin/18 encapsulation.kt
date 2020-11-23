/*
    # 캡슐화
    - 객체가 가지고 있는 변수는 메서드에 구현한 코드가 정상적으로 동작하기 위한 데이터를 담는다
    - 만약 변수에 엉뚱한 데이터가 담긴다면 구현한 코드가 정상적으로 동작한다 하더라도 비정상적인 결과가 나올 수 있다.
    - 따라서 변수의 직접적인 접근을 차단하여 외부에서 값을 변경하지 못하도록 막는 것을 캡슐화라고 한다.

    # Property
    - 캡슐화가 적용된 변수는 외부에서의 접근이 차단된다.
    - 캡슐화가 적용된 변수에 대해 메서드를 통해 값을 설정하거나 가져다 사용할 수 있도록 구성한 것을 Property 라고 부른다
    - 변수에 값을 넣는 메서드는 setter, 가지고 있는 값을 반환하는 메서드는 getter 라고 부른다.

    # Property 작성 방법
    - private 키워드를 변수에 설정 -> 외부 접근 막기
    - 변수들 중 외부에 공개하고자 하는 변수 -> setter, getter 지정

    (1) 주 생성자 사용하기
    - 주 생성자의 매개변수를 정의할 때 var, val 지정 시 Property 로 작성된다.
    - var: getter, setter / val: getter

    (2) 클래스의 멤버 변수
    - var, val

    (3) 보조 생성자에는 val, var 키워드 사용 불가!
*/

class Class18_1(var a1:Int, val a2:Int) {
    // constructor(var a3:Int, val a4:Int, val a5:Int) : this(a3, a4) { } // error
}

// getter, setter 직접 구현하기
class Class18_2 {
    val a1:Int = 0
    var a2:Int = 0
    var a3:Int = 100
        // get() = field // field === a3
        get() {
            println(">> get_a3() 호출")
            return field
        }
        set(value) {
            println(">> set_a3($value) 호출")
            field = value
        }
}

/*
    - 외부에서 변수에 대해 직접적인 접근을 차단하는 것을 캡슐화라고 부른다.
    - 캡슐화를 적용한 변수에 getter, setter 를 설정한 것을 Property 라고 부른다.
    (코틀린에서 모든 변수는 Property 가 적용된다)
*/