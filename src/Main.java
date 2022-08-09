package src;


public class Main {

    public static void main(String[] args) {

        int[] salesManager1 = {67, 3, 7, 23,455,200,2};
        int[] salesManager2 = {1, 3, 45, 238};

        int[] sales = salesManager1;

        SalesManager manager = new SalesManager(sales);
        System.out.println("Максимальная по сумме продажа " + manager.max());
        System.out.println("Средняя сумма продаж " + manager.calcStat());
    }
}
