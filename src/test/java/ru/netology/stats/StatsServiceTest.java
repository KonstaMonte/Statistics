package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    private StatsService service = new StatsService();
    private int[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCalcSum() {
        int actual = service.calcSum(items);

        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAvg() {
        assertEquals(15, service.findAvg(items));
    }

    @Test
    public void shouldMaxSales() {
        assertEquals(8, service.maxSales(items));
    }

    @Test
    public void shouldMinSales() {
        assertEquals(9, service.minSales(items));
    }

    @Test
    public void shouldCountSalesAmountLessThanAverage() {
        assertEquals(5, service.salesAmountLessThanAverage(items));
    }

    @Test
    public void shouldCountSalesAmountMoreThanAverage() {
        assertEquals(5, service.salesAmountMoreThanAverage(items));
    }
}