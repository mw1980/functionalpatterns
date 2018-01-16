package strategy;

public interface ClassicalActionStrategy {
    Action nextMove();

    class BuyStrategy implements ClassicalActionStrategy {
        @Override
        public Action nextMove() {
            return Action.BUY;
        }
    }

    class SellStrategy implements ClassicalActionStrategy {
        @Override
        public Action nextMove() {
            return Action.SELL;
        }
    }

    class WaitStrategy implements ClassicalActionStrategy {
        @Override
        public Action nextMove() {
            return Action.WAIT;
        }
    }
}
