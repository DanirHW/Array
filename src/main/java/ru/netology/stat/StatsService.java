package ru.netology.stat;

public class StatsService {

    public int sumSales(long[] sales) { // Сумма всех продаж
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSumSales(long[] sales) { // Средняя сумма всех продаж
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum / sales.length;
    }

    public int maxSales(long[] sales) { // Номер месяца в котором был пик продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSales(long[] sales) { // Номер месяца в котором был минимум продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }


    public int lessAverageSumSales(long[] sales) {  // Номер месяца в котором продажи были ниже среднего
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        int average = sum / sales.length;
        int lessAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                lessAverage = i + 1;
            }
        }
        return lessAverage;
    }


    public int overAverageSumSales(long[] sales) {  // Номер месяца в котором продажи были ниже среднего
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        int average = sum / sales.length;
        int overAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                overAverage = i + 1;
            }
        }
        return overAverage;
    }
}
