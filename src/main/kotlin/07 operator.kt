/*
    # 연산자
    - Kotlin 은 연산자와 함수 두 가지를 제공한다.
 */

fun main() {
    unary_operator_1()
    unary_operator_2()
}

/*******************************************/

fun unary_operator_1() {
    val a1:Int = 10
    val a2:Int = -10

    val b1:Int = +a1
    val b2:Int = +a2

    val c1:Int = -a1
    val c2:Int = -a2

    println("a1: $a1, a2: $a2")
    println("b1: $b1, b2: $b2")
    println("c1: $c1, c2: $c2")
}

fun unary_operator_2() {
    val a1:Boolean = true
    val a2:Boolean = false

    val b1 = !a1
    val b2 = !a2

    println("a1: $a1, a2: $a2")
    println("b1: $b1, b2: $b2")
}

fun unary_operator_3() {
    val a1:Int = 10
    var a2:Int = 10

    //a1++ //=> a1 = a1 + 1
    a2++ //=> a2 = a2 + 1

    // 이 외에 ++x, --x, x++, x--
}

/*******************************************/

fun arithmetic_operator() {
    // +, -, *, /, %
    val a1:IntRange = 10..20
    println("a1: $a1")
}

/*******************************************/

fun assignment_operator() {
    // +=, -=, *=, /=, %=

    // a.plusAssign(b)
    // a.minusAssign(b)
    // a.timesAssign(b)
    // a.divAssign(b)
    // a.remAssign(b).a.modAssign(b) (deprecated)
}

/*******************************************/

fun comparison_operator() {
    // a == b   a?.equals(b) ?: (b === null)
    // a != b   !(a?.equals(b) ?: (b === null))

    // a > b    a.compareTo(b) > 0
    // a < b    a.compareTo(b) < 0
    // a >= b   a.compareTo(b) >= 0
    // a <= b   a.compareTo(b) <= 0
}

