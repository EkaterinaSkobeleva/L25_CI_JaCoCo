package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {1, 5, 2, 4, 5, 3, 7, 6};
        long expected = 7;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void newTestForFullCoverage() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        long expected = 1;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}