package factorymethod;

import factorymethod.Product.ProductId;

import java.util.function.Function;
import java.util.function.Supplier;

class FunctionalProductFactory {

    static final Function<ProductId, Supplier<Product>> productSupplier = productId -> {
        switch (productId) {
            case FIRST:
                return Product.FirstProduct::new;
            case SECOND:
                return Product.SecondProduct::new;
            case UNKNOWN:
            default:
                throw new IllegalArgumentException("Unable to find the product for the product id: " + productId);
        }
    };
}
