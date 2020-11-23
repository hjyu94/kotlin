fun main() {

}

fun what_is_return(a: Int) : Int {
    println(">> what_is_return(a:$a))")
    if(a == 0) {
        return -1
    }
    return 100 / a
}

fun what_is_break_continue() {
    for(item in 1..10) {
        if(item > 5) {
            break // or continue
        }
        println("item: $item")
    }
}