/*
    # 함수
    - 코드를 미리 작성해 놓고 필요할 때 불러다 쓰는 개념
    - Java 에서는 클래스에서 메서드를 만들어 사용하지만
    Kotlin 은 C 언어처럼 함수라는 개념을 제공하고 있다.
    - Kotlin 은 함수로만 프로그램 작성이 가능하다.
 */

fun main() {
    run_test3()
}

/**************************************************/

fun test1() {
    println("매개변수가 없는 함수")
}

/**************************************************/

fun test2(a1:Int, a2:Double) {
    println("a1: $a1, a2: $a2")
}

fun run_test2() {
    test2(100, 22.22)
    // test2(22.22, 100) // 매개변수를 입력한 순서대로 들어간다.
    test2(a2=22.22, a1=100) // 매개변수를 키=값 쌍으로 넣을 수도 있다.
}

/**************************************************/

fun test3(a1:Int = 0, a2:Double = 0.0) {
    println("a1: $a1, a2: $a2")
}

fun run_test3() {
    test3(100, 22.22)
    test3(100)
    // test3(22.22)
    test3(a2=22.22)
}

/**************************************************/

fun test4(a1:Int, a2:Int) : Int { // 반환값이 있는 함수
    println(">> test4 called.")
    return a1 + a2
}

fun run_test4() {
    val result1 = test4(10, 20)
    val result2: Int = test4(10, 20)
}

fun test5() : Unit { // 반환값이 없는 경우. Unit 은 생략할 수 있다.
    println(">> test5 has no return.")
}

/**************************************************/

fun overloading() {
    println(">> overloading fun 1")
}
fun overloading(a1:Int) {
    println(">> overloading fun 2_1")
}
//매개변수의 이름만 다른 경우는 오버로딩이 가능하지 않다.
//fun overloading(a2:Int) {
//    println(">> overloading fun 2_2")
//}
fun overloading(a1:Double) {
    println(">> overloading fun 2_3")
}
fun overloading(a1:Int, a2:Double) {
    println(">> overloading fun 3")
}
