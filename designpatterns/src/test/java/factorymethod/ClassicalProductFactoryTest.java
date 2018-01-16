package factorymethod;

import factorymethod.Product.FirstProduct;
import factorymethod.Product.ProductId;
import factorymethod.Product.SecondProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClassicalProductFactoryTest {

    private final ClassicalProductFactory underTest = new ClassicalProductFactory();

    @Test
    void shouldReturnFirstProductForFirstId() {
        assertEquals(
                FirstProduct.class,
                underTest.productWithId(ProductId.FIRST).getClass()
        );
    }

    @Test
    void shouldReturnSecondProductForSecondId() {
        assertEquals(
                SecondProduct.class,
                underTest.productWithId(ProductId.SECOND).getClass()
        );
    }

    @Test
    void shouldThrowExceptionForUnknownProduct() {
        assertThrows(IllegalArgumentException.class,
                () -> underTest.productWithId(ProductId.UNKNOWN));
    }

}