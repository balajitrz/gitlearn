package common;

class C {
    private boolean getBoolean() {
        return false;
    }
}

interface I {
    default boolean getBoolean() {
        return true;
    }
}

class D extends C implements I {}

public class DoubleClickTest {
    public static void main(String[] a) {
        foo(new D());
    }

    public static void foo(I i) {
        System.out.println(i.getBoolean());
    }
}
