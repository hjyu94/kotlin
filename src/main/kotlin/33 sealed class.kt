/*
    # Sealed Class
    - 열거형은 특정 값을 의미하는 상수들을 모아 관리하는 개념
    - Sealed Class 는 객체를 모아 관리하는 개념
    - 열거형의 경우 상수에 지정된 값은 절대 변경이 불가능하지만
    - Sealed Class 를 객체를 관리하는 개념이므로 객체가 가지고 있는 변수 값을 설정하여 지정된 값을 변경할 수 있다.
    - 열겨형 사용 시 상수가 의미하는 값을 수시로 변경하거나 다양한 형태로 사용하고자 할 때 사용한다.
*/

sealed class Number2 {
    class SealedOne(val a: Int) : Number2()
    class SealedTwo(val b: Int) : Number2() {
        fun sealedFun() {
            println(">> SealedTwo: sealedFun()")
        }
    }
    class SealedThree(val c: Int, val str: String) : Number2()
}

fun checkNumber(obj: Number2) {
    when(obj) {
        is Number2.SealedOne /* 스마트 캐스팅 발생 */ -> {
            println("[One] a: ${obj.a}")
        }

        is Number2.SealedTwo -> {
            println("[Two] b: ${obj.b}")
        }

        is Number2.SealedThree -> {
            println("[Three] c: ${obj.c}")

            when(obj.c) { // 여기 안에서 또 분기처리 가능
                1 -> println("")
                2 -> println("")
            }
        }
    }
}

fun main() {
    val v1 = Number2.SealedOne(1)
    val v2 = Number2.SealedTwo(2)

    checkNumber(v1)
    checkNumber(v2)
}