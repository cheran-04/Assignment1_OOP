public class AccessModifiersExample {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.publicMethod();
        // helper.privateMethod();    // <-- compile error: not accessible
        helper.callPrivate();
        helper.protectedMethod();
        helper.defaultMethod();
        StaticDemo.staticMethod();
    }
}

class Helper {
    public void publicMethod() {
        System.out.println("publicMethod(): accessible everywhere.");
    }

    private void privateMethod() {
        System.out.println("privateMethod(): accessible only within Helper.");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod(): accessible in same package or subclasses.");
    }

    void defaultMethod() {
        System.out.println("defaultMethod(): accessible in same package.");
    }

    public void callPrivate() {
        System.out.print("callPrivate(): ");
        privateMethod();
    }
}

class StaticDemo {
    public static void staticMethod() {
        System.out.println("staticMethod(): called without instance.");
    }
}
