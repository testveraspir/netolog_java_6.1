package ru.netology.stats;

public class StatsService {
    public int findSum(int[] dataOnMonth) {
        int sum = 0;
        for (int data : dataOnMonth) {
            sum = sum + data;
        }
        return sum;
    }

    public int findMiddleSum(int[] dataOnMonth) {
        int sum = findSum(dataOnMonth);
        int middleSum = sum / dataOnMonth.length;
        return middleSum;
    }

    public int findMonthMaxSales(int[] dataOnMonth) {
        int max = dataOnMonth[0];
        int monthMaxSales = 0;
        for (int i = 0; i < dataOnMonth.length; i++) {
            int mas = dataOnMonth[i];
            if (mas >= max) {
                max = mas;
                monthMaxSales = i;
            }
        }
        return monthMaxSales + 1;
    }

    public int findMonthMinimalSales(int[] dataOnMonth) {
        int minimum = dataOnMonth[0];
        int monthMinimalSales = 0;
        for (int i = 0; i < dataOnMonth.length; i++) {
            int mas = dataOnMonth[i];
            if (mas <= minimum) {
                minimum = mas;
                monthMinimalSales = i;
            }
        }
        return monthMinimalSales + 1;
    }

    public int findAmountMonthBelowMiddle(int[] dataOnMonth) {
        int sumMiddle = findMiddleSum(dataOnMonth);
        int amountMonthBelow = 0;
        for (int data : dataOnMonth) {
            if (data < sumMiddle) {
                amountMonthBelow++;
            }
        }
        return amountMonthBelow;
    }

    public int findAmountMonthHigherMiddle(int[] dataOnMonth) {
        int sumMiddle = findMiddleSum(dataOnMonth);
        int amountMonthHigher = 0;
        for (int data : dataOnMonth) {
            if (data > sumMiddle) {
                amountMonthHigher++;
            }
        }
        return amountMonthHigher;
    }
}
