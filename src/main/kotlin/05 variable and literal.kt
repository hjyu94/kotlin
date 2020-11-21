/*
    1. Kotlin 은 모든 기본 타입 값을 객체로 만들어 관리한다.
    2. Kotlin 은 null 을 허용하는 변수와 허용하지 않는 변수를 제공한다.
 */

fun main() {
    val_var_null_3()
}

fun literal() {
    // 정수 리터럴
    println(100)
    println(10000000000)
    println(10000000000L)
    println(123_456_789_012)

    // 실수 리터럴
    println(11.11) // double, 8byte
    println(22.22f) // float, 4byte

    // 문자 리터럴
    println('A')
    println('가')

    // 문자열 리터럴
    println("ABC")
    println("가나다")

    // 논리 리터럴
    println(true)
    println(false)

    // Raw string
    println("동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세")
    println(
        """동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin()
    )
}

fun val_var_1() {
    // val 자동 추론
    val a1: Int = 100
    println("a1: $a1") // 변수 한개의 이름만 들어가 있는 경우 괄호가 없어도 된다.
    println("a1: ${a1}")

    val a2 = 100 // 타입 자동 추론
    println("a2: $a2")
}

fun val_var_2() {
    // val vs var
    val a3:Int = 100
    var a4:Int = 100

    // a3 = 200 // val 변수는 값을 다시 지정할 수 없다.
    println("a3: $a3")

    a4 = 200
    println("a4: $a4")
}

fun val_var_null_1() {
    // var a1:Int = null // 불가
    var a2:Int? = null
}

fun val_var_null_2() {
    var a1:Int = 100
    var a2:Int? = null

    // 자동 타입 추론
    var b1 = a1
    var b2 = a2

    // 널을 허용하지 않는 데이터 타입에는
    // 1. 널을 허용하지 않는 변수를 넣을 수 있고
    // 2. 널이 들어올 수도 있는 변수는 넣을 수 없다.
    var c1:Int = a1
    // var c2:Int = a2 // X

    // 널이 들어올 수도 있는 데이터 타입에는
    // 널을 허용하지 않는 변수나, 널이 들어올 수도 있는 변수
    // 둘 다 넣을 수 있다.
    var d1:Int? = a1
    var d2:Int? = a2
}

fun val_var_null_3() {
    var a:Int? = null

    // var b:Int = a // 널이 아니여야만 하는 데이터 타입에 널일 수도 있는 변수를 넣을 수 없다.

    // 원래 변수 a 에 null 이 들어올 수도 있기 때문에
    // null 을 허용하지 않는 데이터 타입의 변수 c 에 넣을 수 없지만
    // !! 를 붙여주면 넣을 수 있다.

    // 그러나 컴파일 타임에 에러가 발생하지 않았다고 하더라도
    // 런타임에 NPE 가 발생할 가능성이 농후해지기 때문에
    // 정말로, 해당 변수가 null 이 아니라는 보장이 없다면 지양 하도록 한다.
    var c:Int = a!!
}