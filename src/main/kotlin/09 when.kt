/*
    # when
    - 자바의 switch case 와 비슷
    - 자바와 다르게 정수 뿐 아니라 다양한 타입의 값과 비교 할 수 있다.
 */

fun main() {
    test()
}

fun test() {
    val a1 = 20

    when(a1) {
        1 -> println("1 ㅇㅇ")
        2 -> println("2 ㅇㅇ")
        3 -> {
            println("3 ㅇㅇ")
            println("여러 줄 실행 시 {} 사용")
       }
        4, 5 -> println("4 or 5 ㅇㅇ")
        in 6..9 -> println("6 ~ 9 ㅇㅇ")
        else -> println("1~9 ㄴㄴ")
    }
}

// 함수로도 사용 될 수 있다.
// 함수 선언에 when 절을 사용할 경우 else 구문이 필수적이다.
fun setValue(a1: Int) : Unit = when(a1) {
    1 -> println("")
    else -> println("1 ㄴㄴ")
}