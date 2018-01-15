package singleton;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Utils.printSeparator;
import static utils.Utils.printText;

class FunctionalSingletonTest {
    @Test
    void shouldReturnTheRightValueOverSingletonInstance() {
        checkInstanceValue();
        printSeparator();
        checkInstanceValue();
    }

    private void checkInstanceValue() {
        final Supplier<FunctionalSingleton> firstInstanceSupplier = FunctionalSingleton.instance();
        printText("Checking the instance value");
        assertEquals("42", firstInstanceSupplier.get().value());
    }
}
