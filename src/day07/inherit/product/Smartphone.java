package day07.inherit.product;

public class Smartphone extends ElectronicProduct {

    int storageCapacity;

    public Smartphone(String productName, double price, String manufacturer, int storageCapacity) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("저장 용량: %d GB\n", this.storageCapacity);
    }
}
