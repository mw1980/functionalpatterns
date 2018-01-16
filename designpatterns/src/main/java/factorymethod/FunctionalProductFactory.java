package factorymethod;

import factorymethod.Product.FirstProduct;
import factorymethod.Product.ProductId;
import factorymethod.Product.SecondProduct;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

class FunctionalProductFactory {

    private static Function<ProductId, Optional<Product>> FIRST_PRODUCT_PRODUCER =
            productId -> ProductId.FIRST == productId ? Optional.of(new FirstProduct()) : Optional.empty();

    private static Function<ProductId, Optional<Product>> SECOND_PRODUCT_PRODUCER =
            productId -> ProductId.SECOND == productId ? Optional.of(new SecondProduct()) : Optional.empty();

    private static Function<ProductId, Optional<Product>> UNKNOWN_PRODUCT_PRODUCER =
            productId -> ProductId.UNKNOWN == productId ? Optional.empty() : Optional.empty();

    Product createProduct(final ProductId productId) {
        return Stream.of(FIRST_PRODUCT_PRODUCER, SECOND_PRODUCT_PRODUCER, UNKNOWN_PRODUCT_PRODUCER)
                .map(function -> function.apply(productId))
                .filter(Optional::isPresent)
                .findFirst()
                .flatMap(Function.identity())
                .orElseThrow(() -> new IllegalArgumentException("Unable to identify the product: " + productId));
    }

    public static void main(final String[] args) {
        System.out.println(new FunctionalProductFactory().createProduct(ProductId.FIRST));
        System.out.println(new FunctionalProductFactory().createProduct(ProductId.SECOND));
        System.out.println(new FunctionalProductFactory().createProduct(ProductId.UNKNOWN));
    }
}
