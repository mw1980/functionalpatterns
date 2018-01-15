package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Utils.printSeparator;
import static utils.Utils.printText;

class ClassicalSingletonTest {

    @Test
    void shouldReturnValueOverTheClassicalSingleton() {
        checkInstanceValue();
        printSeparator();
        checkInstanceValue();
    }

    private void checkInstanceValue() {
        final ClassicalSingleton firstInstance = ClassicalSingleton.instance();
        printText("Checking the instance value");
        assertEquals("42", firstInstance.value());
    }
}
