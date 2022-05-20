package lld.designPatterns.behavioralDesignPattern.strategyDesignPattern.amazon;

public class Customer {
    public static void main(String[] args) {
        Product product = new Product("diamond necklace", 1000000);

        AmazonCart amazonCart = new AmazonCart(new GooglePay(), product);

        amazonCart.pay();
    }
}
