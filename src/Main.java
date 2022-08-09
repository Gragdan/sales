package src;


public class Main {

    public static void main(String[] args) {

        int[] salesManager1 = {67, 3, 7, 23};
        int[] salesManager2 = {1, 3, 45, 238};

        int[] sales = salesManager1;

        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}
