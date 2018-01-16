package decorator;

import decorator.oo.BasicPizza;
import decorator.oo.PizzaWithFunghi;
import decorator.oo.PizzaWithProsciuto;

import static decorator.functional.Repository.BASIC_PIZZA_RECEIPT;
import static decorator.functional.Repository.FUNGHI_PIZZA_RECEIPT;
import static decorator.functional.Repository.PROSCIUTO_PIZZA_RECEIPT;
import static utils.Utils.printText;

public class Main {

    public static void main(String[] arguments) {
        final PizzaWithProsciuto prosciutoAndFunghi = new PizzaWithProsciuto(
                new PizzaWithFunghi(
                        new BasicPizza()
                )
        );

        printText(prosciutoAndFunghi.receipt());


        printText(
                BASIC_PIZZA_RECEIPT
                        .andThen(FUNGHI_PIZZA_RECEIPT)
                        .andThen(PROSCIUTO_PIZZA_RECEIPT)
                        .apply("The receipt:")
        );
    }
}
