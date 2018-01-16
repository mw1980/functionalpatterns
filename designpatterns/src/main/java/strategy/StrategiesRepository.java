package strategy;

import java.util.function.Supplier;

class StrategiesRepository {

    private StrategiesRepository() {
        //avoid instantiation
    }

    static final Supplier<Action> BUY_SUPPLIER = () -> Action.BUY;
    static final Supplier<Action> SELL_SUPPLIER = () -> Action.SELL;
    static final Supplier<Action> WAIT_SUPPLIER = () -> Action.WAIT;
}
