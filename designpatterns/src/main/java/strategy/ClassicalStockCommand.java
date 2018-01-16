package strategy;

import static java.lang.String.format;

class ClassicalStockCommand {

    private final String stockName;
    private final ClassicalActionStrategy strategy;

    ClassicalStockCommand(final String name, final ClassicalActionStrategy strategy) {
        this.stockName = name;
        this.strategy = strategy;
    }

    String execute(){
        return format("The next action for the stock %s is to %s.", stockName, strategy.nextMove());
    }
}
