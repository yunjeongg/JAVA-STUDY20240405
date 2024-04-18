package day08.static_.quiz2;

public class Store {

    private static int totalSales; // 총 판매액

    public static void addSale(int amount) {
        totalSales += amount;
    }

    public static int getTotalSales() {
        return totalSales;
    }
}
