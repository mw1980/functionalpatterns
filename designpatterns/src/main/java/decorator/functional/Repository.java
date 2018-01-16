package decorator.functional;

import java.util.function.Function;

public class Repository {
    public static final Function<String, String> BASIC_PIZZA_RECEIPT = seed -> seed + " basic ingredients";
    public static final Function<String, String> FUNGHI_PIZZA_RECEIPT = seed -> seed + " and mushrooms";
    public static final Function<String, String> PROSCIUTO_PIZZA_RECEIPT = seed -> seed + " and prosciuto";
}
