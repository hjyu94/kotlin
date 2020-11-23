public class _25_companion {
    public int nonstatic_a = 100;
    public static int static_a = 200;

    public void nonstatic_method() {
        System.out.println("java method");
    }
    public static void static_method() {
        System.out.println("java static method");
    }

    public static void main(String[] args) {
        TestClass25_1 obj = new TestClass25_1();
        System.out.printf("obj.a1: %d", obj.getA());
        obj.fun1();

        // @JvmStatic (X)
        System.out.printf("getCompanion_a: %d", TestClass25_1.Companion.getCompanion_a());
        TestClass25_1.Companion.companion_fun1();

        // @JvmStatic (O)
        System.out.printf("getCompanion_a: %d", TestClass25_1.getCompanion_b());
        TestClass25_1.getCompanion_b();
    }
}
