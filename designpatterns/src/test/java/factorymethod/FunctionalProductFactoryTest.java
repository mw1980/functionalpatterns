package factorymethod;

import factorymethod.Product.FirstProduct;
import factorymethod.Product.ProductId;
import factorymethod.Product.SecondProduct;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FunctionalProductFactoryTest {

    private final Function<ProductId, Supplier<Product>> underTest = FunctionalProductFactory.productSupplier;

    @Test
    void shouldReturnFirstProductSupplierForFirstProductId() {
        assertEquals(
                FirstProduct.class,
                underTest.apply(ProductId.FIRST).get().getClass()
        );
    }

    @Test
    void shouldReturnSecondProductSupplierForSecondProductId() {
        assertEquals(
                SecondProduct.class,
                underTest.apply(ProductId.SECOND).get().getClass()
        );
    }

    @Test
    void shouldThrowExceptionForUnknownProductId() {
        assertThrows(
                IllegalArgumentException.class,
                () ->  underTest.apply(ProductId.UNKNOWN)
        );
    }
}