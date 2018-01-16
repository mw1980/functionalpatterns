package decorator.oo;

import static java.lang.String.format;

public class PizzaWithFunghi implements Pizza {
    private final Pizza original;

    public PizzaWithFunghi(final Pizza originalPizza) {
        this.original = originalPizza;
    }

    @Override
    public String receipt() {
        return format("%s and mushrooms",original.receipt());
    }
}
