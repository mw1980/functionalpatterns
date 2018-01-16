package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FunctionalStockCommandTest {
    private final static String STOCK = "SAP";

    @Test
    void shouldSellWithSellStrategy() {
        assertTrue(
                new FunctionalStockCommand(STOCK, StrategiesRepository.SELL_SUPPLIER)
                        .execute()
                        .toLowerCase()
                        .contains("sell")
        );
    }

    @Test
    void shouldBuyWithBuyStrategy() {
        assertTrue(
                new FunctionalStockCommand(STOCK,  StrategiesRepository.BUY_SUPPLIER)
                        .execute()
                        .toLowerCase()
                        .contains("buy")
        );
    }

    @Test
    void shouldWaitWithWaitStrategy() {
        assertTrue(
                new FunctionalStockCommand(STOCK,  StrategiesRepository.WAIT_SUPPLIER)
                        .execute()
                        .toLowerCase()
                        .contains("wait")
        );
    }

}