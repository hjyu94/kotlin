/*
    # access specifiers 접근 제어자
    - Kotlin 에서는 클래스에서 정의한 모든 변수가 Java로 변경될 때 private 이 붙는다
    - 접근 제한자의 종류에 따라 Java 코드로 변경될 때 getter 메서드 추가 여부가 결정된다.
 */

class TestClass17_1(a1:Int, a2:Int)
/*
    public final class TestClass17_1 {
       public TestClass17_1(int a1, int a2) {
       }
    }
*/

class TestClass17_2(val a1:Int, var a2:Int) {
    val a3:Int= 0
    var a4:Int= 0
}
/*
    public final class TestClass17_2 {
       private final int a1; // getter
       private int a2; // setter

       private final int a3; // getter,
       private int a4; // getter, setter

       public TestClass17_2(int a1, int a2) {
          this.a1 = a1;
          this.a2 = a2;
       }
    }
 */


/*
    (코틀린은 패키지가 같으냐 다르냐를 구분하지 않는다)

    # 클래스
    - private: 외부에서 객체 새성 불가
    - public: 외부에서 객체를 생성할 수 있다. (기본)
    - protected: 클래스에 지정 불가능 (kotlin)
    - internal: 모듈이 같은 경우에만 객체 생성 가능

    # 변수, 메서드
    - private: 외부에서 접근 불가능
    - public: 외부에서 접근 가능 (기본)
    - protected: 상속 관계인 경우만 접근 가능
    - internal: 모듈이 같은 경우에만 접근 가능
 */
