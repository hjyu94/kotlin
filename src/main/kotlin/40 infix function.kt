/*
    # Infix 함수
    - 함수를 연산자처럼 사용할 수 있는 함
 */

infix fun Int.add(a1: Int): Int {
    return this + a1
}

fun main() {
    val r1 = 100 add 50 // Int.add() 를 호출, 해당 함수 내에서 this 는 Int(100)임
    val r2 = 100.add(50)
}