package factorymethod;

public interface Product {
    //add real methods

    class FirstProduct implements Product {
    }

    class SecondProduct implements Product {
    }

    enum ProductId {
        FIRST, SECOND, UNKNOWN
    }
}
