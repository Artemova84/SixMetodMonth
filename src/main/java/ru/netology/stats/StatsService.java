
package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {

        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int amountSales(long[] sales) {
        int amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            amountMonth += sales[i];
        }
        return amountMonth;
    }

    public int averageAmountSales(long[] sales) {
        int averageAmount = amountSales(sales) / sales.length;
        return averageAmount;
    }

    public int moreAverageAmount(long[] sales) {
        int moreAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmountSales(sales)) {
                moreAverage++;
            }
        }
        return moreAverage;

    }

    public int lessAverageAmount(long[] sales) {
        int lessAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmountSales(sales)) {
                lessAverage++;
            }
        }
        return lessAverage;

    }
}





