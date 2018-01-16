package factorymethod;

import factorymethod.Product.FirstProduct;
import factorymethod.Product.ProductId;
import factorymethod.Product.SecondProduct;

import static factorymethod.Product.ProductId.UNKNOWN;

class ClassicalProductFactory {

    Product productWithId(final ProductId productId) {
        switch (productId) {
            case FIRST:
                return new FirstProduct();
            case SECOND:
                return new SecondProduct();
            case UNKNOWN:
            default:
                throw new IllegalArgumentException("Unable to find product with id: " + UNKNOWN);
        }
    }
}
