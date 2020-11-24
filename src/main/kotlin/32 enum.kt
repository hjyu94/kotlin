/*
    # 열거형
    - 특정 그룹 안의 구성 요소를 정의하는 값
 */

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun printDirection(a: Direction) {
    when(a) {
        Direction.NORTH -> println("...")
        Direction.SOUTH -> println("...")
        Direction.EAST -> println("...")
        Direction.WEST -> println("...")
    }
}

fun testPrintDirection() {
    printDirection(Direction.NORTH)
    printDirection(Direction.EAST)

    // 변수에 담을 수도 있다.
    val dir: Direction = Direction.EAST
    printDirection(dir)
}

/****************************************************/

enum class Number(val num: Int, val str: String) {
    ONE(1, "일"), TWO(2, "이"), THREE(3, "삼")
}

fun printNumber(a: Number) {
    when(a) {
        Number.ONE -> println("...")
        Number.TWO -> println("...")
        Number.THREE -> println("...")
    }
    when(a.num) {
        1 -> println("")
        2 -> println("")
        3 -> println("")
    }
    when(a.str) {
        "일" -> println("")
        "이" -> println("")
        "삼" -> println("")
    }
}

fun testPrintNumber() {
    printNumber(Number.ONE)
    printNumber(Number.TWO)

}

