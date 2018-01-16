package factorymethod;

import factorymethod.Product.FirstProduct;
import factorymethod.Product.ProductId;
import factorymethod.Product.SecondProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FunctionalProductFactoryTest {

    private final FunctionalProductFactory underTest = new FunctionalProductFactory();

    @Test
    void shouldReturnFirstProductSupplierForFirstProductId() {
        assertEquals(
                FirstProduct.class,
                underTest.createProduct (ProductId.FIRST).getClass()
        );
    }

    @Test
    void shouldReturnSecondProductSupplierForSecondProductId() {
        assertEquals(
                SecondProduct.class,
                underTest.createProduct(ProductId.SECOND).getClass()
        );
    }

    @Test
    void shouldThrowExceptionForUnknownProductId() {
        assertThrows(
                IllegalArgumentException.class,
                () ->  underTest.createProduct(ProductId.UNKNOWN)
        );
    }
}