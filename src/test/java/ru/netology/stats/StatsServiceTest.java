package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void findSum() {
        StatsService service=new StatsService();
        int []dataAboutSales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=180;
        int actual=service.findSum(dataAboutSales);
        assertEquals(expected, actual);
    }

    @Test
    void findMiddleSum() {
        StatsService service=new StatsService();
        int []dataAboutSales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=15;
        int actual=service.findMiddleSum(dataAboutSales);
        assertEquals(expected, actual);
    }

    @Test
    void findMonthMaxSales() {
        StatsService service=new StatsService();
        int []dataAboutSales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=8;
        int actual=service.findMonthMaxSales(dataAboutSales);
        assertEquals(expected, actual);
    }

    @Test
    void findMonthMinimalSales() {
        StatsService service=new StatsService();
        int []dataAboutSales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=9;
        int actual=service.findMonthMinimalSales(dataAboutSales);
        assertEquals(expected, actual);
    }

    @Test
    void findAmountMonthBelowMiddle() {
        StatsService service=new StatsService();
        int []dataAboutSales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=5;
        int actual=service.findAmountMonthBelowMiddle(dataAboutSales);
        assertEquals(expected, actual);
    }

    @Test
    void findAmountMonthHigherMiddle() {
        StatsService service=new StatsService();
        int []dataAboutSales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=5;
        int actual=service.findAmountMonthHigherMiddle(dataAboutSales);
        assertEquals(expected, actual);
    }
}