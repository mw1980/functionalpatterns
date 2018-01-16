package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static strategy.ClassicalActionStrategy.BuyStrategy;
import static strategy.ClassicalActionStrategy.SellStrategy;
import static strategy.ClassicalActionStrategy.WaitStrategy;

class ClassicalStockCommandTest {
    private final static String NAME = "SAP";

    @Test
    void shouldSellWithSellStrategy() {
        assertTrue(
                new ClassicalStockCommand(NAME, new SellStrategy())
                        .execute()
                        .toLowerCase()
                        .contains("sell")
        );
    }

    @Test
    void shouldBuyWithBuyStrategy() {
        assertTrue(
                new ClassicalStockCommand(NAME, new BuyStrategy())
                        .execute()
                        .toLowerCase()
                        .contains("buy")
        );
    }

    @Test
    void shouldWaitWithWaitStrategy() {
        assertTrue(
                new ClassicalStockCommand(NAME, new WaitStrategy())
                        .execute()
                        .toLowerCase()
                        .contains("wait")
        );
    }

}