package src;


public class Main {

    public static void main(String[] args) {

        long[] salesManager1 = {67, 3, 7, 23};
        long[] salesManager2 = {1, 3, 45, 238};

        long[] sales = salesManager1;

        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}
