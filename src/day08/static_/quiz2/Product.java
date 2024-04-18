package day08.static_.quiz2;

public class Product {

    private String productName;    // 제품명
    private int price;             // 가격

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public void sellProduct() {
        Store.addSale(this.price);
    }
}
