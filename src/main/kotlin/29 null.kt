/*
    # null 처리

    (1) !! 연산자
    - null 을 허용하는 변수에 담긴 객체의 주소 값을
      null을 허용하지 않는 형태의 값으로 변환하는 연산자
    - null을 허용하는 변수에 담긴 값을 null을 허용하지 않는 형태의 변수에 담을 경우 사용
    - 변환 과정에 null값이 들어 있을 경우 오류가 발생한다
    - 사용 지양할 것
 */

fun testFun(str: String?) {
    val value: String = str!! // str 은 null 일 수도 있는데
    // 걔를 null 이 아니여야만 하는 변수에 넣으려고 하니 에러
}

/*
    (2) ?: 연산자
    - 참조변수에 null 이 들어있으면 지정된 기본값을 반환함
 */
fun testFun2(str: String?) {
    val value: String = str ?: "기본 문자열"
}

/*
    (3) ?. 연산자
    - 참조 변수를 통해 메서드를 호출하거나 멤버 변수를 사용할 때
      참조 변수에 객체의 주소값이 들어 있다면 객체에 접근해서 메서드나 변수를 사용한다.
    - 만약 참조 변수에 null 이 있다면 오류가 발생하지 않고 null 을 반환한다
 */
fun testFun3(str: String?) {
    println("str: $str")
    println("str length: ${str?.length}")
}