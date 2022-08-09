package src;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int calcStat(){
        int calcStat = 0;
        int min = sales[0];
        int max = sales[0];
        int sum = 0;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
            if (sale < min) {
                min = sale;
            }
            sum = sum + sale;
        }
        int crop = sum - min - max;
        if (sales.length > 0) {
            calcStat = crop / (sales.length - 2);
        } else {
            System.out.println("Укажите продажи менеджера!");
        }
        return calcStat;
    }
}
