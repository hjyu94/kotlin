/*
    # 인라인 함수
    - ( kotlin -> java ) 변경 될 때 함수를 호출하는 코드를 함수내에 구현한 코드로 변경하는 함수
    - 함수 호출 방식은 전체 코드양이 줄어들어 메모리를 적게 쓴다는 장점(각 코드도 메모리에 한줄한줄 올라감)이 있지만
    호출 시 코드 흐름이 이동하고 다시 돌아와야 하기 대문에 작업량이 늘어난다.
    - 인라인 함수는 전체 코드양이 늘어 메모리를 더 사용하지만 콛 흐름의 이동 없이 수행되기 때문에
    작업량이 늘어나지 않는다.
 */

fun nonInlineFun() {
    println("-----------------------")
    println("what is inline function")
    println("-----------------------")
}

inline fun inlineFun() {
    println("-----------------------")
    println("what is inline function")
    println("-----------------------")
}

fun fun38_nonInline() {
    nonInlineFun()
    nonInlineFun()
}

fun fun38_inline() {
    inlineFun()
    inlineFun()
}

/*
    public static final void fun38_nonInline() {
      nonInlineFun();
      nonInlineFun();
   }

   public static final void fun38_inline() {
      int $i$f$inlineFun = false;
      String var1 = "-----------------------";
      boolean var2 = false;
      System.out.println(var1);
      var1 = "what is inline function";
      var2 = false;
      System.out.println(var1);
      var1 = "-----------------------";
      var2 = false;
      System.out.println(var1);
      $i$f$inlineFun = false;
      var1 = "-----------------------";
      var2 = false;
      System.out.println(var1);
      var1 = "what is inline function";
      var2 = false;
      System.out.println(var1);
      var1 = "-----------------------";
      var2 = false;
      System.out.println(var1);
   }
 */