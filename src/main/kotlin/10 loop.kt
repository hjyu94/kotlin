fun main() {
    intRange()
}

fun intRange() {
    val a1 = 1..10
    val a2 = 10..1
    val a3 = 10 downTo 1
    val a4 = 10 downTo 1 step 2

    for(item in a1) {
        println("a1: $item")
    }

    for(item in a1 step 2) {
        println("a1: $item")
    }

    for(item in a2) {
        println("a2: $item")
    }

    for(item in a3) {
        println("a3: $item")
    }

    for(item in a4) {
        println("a4: $item")
    }
}

/************************************/

fun while_fun() {
    var a = 0
    while(a < 10) {
        println("a: $a")
        a++
    }
}

/************************************/

fun do_while_fun() {
    var a = 0
    do {
        println("a : $a")
        a++
    } while (a < 10)
}