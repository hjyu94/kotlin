/*
    # Generic
    - 클래스 설계 시, 변수의 타입을 유동적으로 하고 싶을 때 사용
    - 객체 생성시 변수의 타입을 설정할 수 있다.

    # 가변성
    - 불변성: 제네릭이 설정된 객체의 주소 값을 같은 타입의 제네릭이 설정된 변수에만 담을 수 있다.
    - 공변성: 제네릭이 설정된 객체의 주소 값을 부모 클래스 타입의 제네릭이 설정된 변수에도 담을 수 있다.
    - 반 공변성: 제네릭이 설정된 객체의 주소 값을 자식 클래스 타입의 제네릭이 설정된 변수에도 담을 수 있다.
 */

fun main() {
    test27_1()
}

class C27_1<T> (var a1: T){ // 객체 생성 시 변수의 타입을 설정할 수 있다.
    fun testMethod(a2: T) {
        println("a2: $a2")
    }
}

fun test27_1() {
    val t1 = C27_1<Int>(200)
    t1.testMethod(100)

    val t2 = C27_1<String>("ABCDE")
    t2.testMethod("abcde")
}

// 여러 종류의 타입으로 제네릭 클래스를 생성할 수 있다.
// 주 생성자에도 사용 가능
class C27_2<A, B> (var a3:B, var a4: B) {
    fun testMethod(a1:A, a2:B) {
        println("a1: $a1, a2: $a2")
    }
}
fun test27_2() {
    var t1 = C27_2<Int, String>("f", "g")
    t1.testMethod(100, "abcde")
}

// 상속과 제네
open class GrandFather
open class Mother : GrandFather()
class Sub : Mother()

// 불변성
class XXX<A>()
fun test27_3() {
    val t1:XXX<Mother> = XXX<Mother>() // 원래 됨
    // val t2:XXX<Sub> = XXX<Mother>() // X
    // val t3:XXX<GrandFather> = XXX<Mother>() // X
}

// 공변성
class YYY<out A>
fun test27_4() {
    val t1:YYY<Mother> = YYY<Mother>() // 원래 됨
    // val t2:YYY<Sub> = YYY<Mother>() // X
    val t3:YYY<GrandFather> = YYY<Mother>() // O
}

// 공변성
class ZZZ<in A>
fun test27_5() {
    val t1:ZZZ<Mother> = ZZZ<Mother>() // 원래 됨
    val t2:ZZZ<Sub> = ZZZ<Mother>() // O
    // val t3:ZZZ<GrandFather> = ZZZ<Mother>() // X
}