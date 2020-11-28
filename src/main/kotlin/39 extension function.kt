/*
    # 확장함수
    - 기존 클래스에 새로운 함수를 추가하는 개념
    - 기존 크래스에 메서드를 추가해 사용하는 것 처럼 보이지만
    사실 한 객체의 주소값을 받은 함수가 만들어지고 그 함수를 호출하는 방식으로 동작
 */

fun main() {
    val str1 = "abcd"
    println(str1.getUpperString())
    // String 클래스에 함수를 하나 추가한것 처럼 보이지만 아님
    // String 을 매개변수로 받는 함수를 하나 추가해서 넘긴 것!
}

fun String.getUpperString(): String {
    return this.toUpperCase()
}

/*
    public static final void main() {
      String str1 = "abcd";
      String var1 = getUpperString(str1);
      boolean var2 = false;
      System.out.println(var1);
   }

   @NotNull
   public static final String getUpperString(@NotNull String $this$getUpperString) {
      Intrinsics.checkNotNullParameter($this$getUpperString, "$this$getUpperString");
      boolean var2 = false;
      String var10000 = $this$getUpperString.toUpperCase();
      Intrinsics.checkNotNullExpressionValue(var10000, "(this as java.lang.String).toUpperCase()");
      return var10000;
   }
*/