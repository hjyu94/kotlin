fun main() {
    val a:Int = 10
    var b:String

    // 자바 style
    if(a == 10) {
        b = "10 ㅇㅇ"
    } else {
        b = "10 ㄴㄴ"
    }

    // 코틀린 style
    b = if (a == 10) "10 ㅇㅇ" else "10 ㄴㄴ"

    // 코틀린은 이런것도 된다
    b = if (a == 10) {
        println("블록 안의 명령 실행.")
        "10 ㅇㅇ"
    } else {
        println("블록 안의 명령 실행.")
        "10 ㄴ"
    }
}