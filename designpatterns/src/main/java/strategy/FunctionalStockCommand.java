package strategy;

import java.util.function.Supplier;

class FunctionalStockCommand {

    private final String name;
    private final Supplier<Action> actionSupplier;

    FunctionalStockCommand(final String name, final Supplier<Action> actionSupplier) {
        this.name = name;
        this.actionSupplier = actionSupplier;
    }

    String execute(){
        return String.format("The next action for the stock %s is to %s.", name, actionSupplier.get());
    }
}
