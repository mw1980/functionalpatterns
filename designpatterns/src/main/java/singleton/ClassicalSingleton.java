package singleton;

import static utils.Utils.printText;

class ClassicalSingleton {
    private static final ClassicalSingleton INSTANCE = new ClassicalSingleton();

    //public instantiation is not wanted
    private ClassicalSingleton() {
        printText("Constructor called");
    }

    static ClassicalSingleton instance() {
        return INSTANCE;
    }

    String value() {
        printText("Extracting instance value");
        return "42";
    }
}
