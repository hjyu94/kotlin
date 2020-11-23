/*
    # Data Class
    - 매개체의 데이터를 관리하는 용도로 사용하는 클래스이다.
    - abstract, open, sealed, inner 클래스로 정의할 수 없다.
    - 반드시 주 생성자를 가지고 있어야 한다.

    # Data Class 에서 자동으로 생성되는 메서드
    - equals(), ==
        주 생성자에서 입력받는 파라매터 값이 동일한지 비교
        원래는 두 객체의 주소값이 같은지를 비교함
    - hashCode()
    - copy()
        ex) val obj1:Object = obj2.copy()
    - toString()
    - componentN()
        주 생성자에서 n 번째에 정의한 값을 가져온다. 객체 분해에 사용된다.
        val (num1, num2) = obj
        // == val num1 = obj.component1()
        // val num2 = obj.component2()
 */

data class TestClass26_2(var a1:Int, var a2:Int)