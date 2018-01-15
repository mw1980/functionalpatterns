package singleton;

import java.util.function.Supplier;

import static utils.Utils.printText;

class FunctionalSingleton {
    private static FunctionalSingleton instance;
    private static final Supplier<FunctionalSingleton> INSTANCE_SUPPLIER = FunctionalSingleton::initializedInstance;

    private static FunctionalSingleton initializedInstance() {
        if (instance == null) {
            instance = new FunctionalSingleton();
        }
        return instance;
    }

    //public instantiation not wanted
    private FunctionalSingleton() {
        printText("Constructor called");
    }

    static Supplier<FunctionalSingleton> instance() {
        return INSTANCE_SUPPLIER;
    }

    String value() {
        printText("Extracting instance value");
        return "42";
    }
}
