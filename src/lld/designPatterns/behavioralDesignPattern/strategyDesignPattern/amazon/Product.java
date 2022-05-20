package lld.designPatterns.behavioralDesignPattern.strategyDesignPattern.amazon;

public class Product {

    String productName;
    int productPrice;

    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }
}
