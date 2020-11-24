/*
    # null 타입의 형 변환
    - null 값이 담긴 객체에 대한 보다 안전한 형변환 방법
    - null 을 허용하는 변수가 null 값이 들어있지 않다는 것을 보장해주면
      null 을 허용하지 않는 타입으로 스마트 캐스팅이 발생한다.

    # if 문 사용
    - if 문에서 null 허용 변수에 null 값이 아닌 객체의 주소 값이 들어있음을 검사해주면
      if 문 안에서는 null 을 허용하지 않는 변수로 변환되어 사용 가능
    - if 문 종료 시 다시 null 허용 변수가 된다.
    - 이 때 비교 연산자 보다는 is 연산자를 추천.
    - 비교 연산자로 검사할 경우 타입이 Any 인 경우 컴파일 오류가 발생
 */

fun main() {

}

fun testMethod31_1(str: String?) {
    println(str!!.length)
}
fun testMethod31_2(str: String?) {
    println(str?.length)
}
fun test31_1() {
    testMethod31_1("안녕하세요")
    testMethod31_1(null) // null pointer exception
    testMethod31_2("안녕하세요")
    testMethod31_2(null) // OK
}

/*************************************************/

fun testMethod31_3(str: String?) {
    if(str is String) { // 스마트 캐스팅 발생
        println(str.length)
    }
    if(str != null) { // 비교 연산자 사용, 스마트 캐스팅 발생
        println(str.length)
    }
//    println(str.length) // if 빠져나가면 다시 null 허용 변수가 된다
}

/*************************************************/

fun testMethod31_4(str: Any?) {
    if(str is String) { // 스마트 캐스팅 + null 허용치 않는 변수로 바뀜
        println(str.length)
    }
    if(str != null) { // 스트링 타입인지 검사하는 부분이 없으므로 에러
        // -> 비교 연산자보다 is 연산자가 더 유용
//        println(str.length)
    }
}
fun test31_2() {
    testMethod31_4("안녕하세요")
    testMethod31_4(null)
}