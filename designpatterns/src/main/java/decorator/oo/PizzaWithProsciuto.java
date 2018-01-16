package decorator.oo;

import static java.lang.String.format;

public class PizzaWithProsciuto implements Pizza {
    private final Pizza original;

    public PizzaWithProsciuto(final Pizza originalPizza) {
        this.original = originalPizza;
    }

    @Override
    public String receipt() {
        return format("%s and prosciuto", original.receipt());
    }
}
