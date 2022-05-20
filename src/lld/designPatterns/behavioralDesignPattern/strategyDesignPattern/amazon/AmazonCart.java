package lld.designPatterns.behavioralDesignPattern.strategyDesignPattern.amazon;

public class AmazonCart {
    WalletStrategy walletStrategy;
    Product product;

    public AmazonCart(WalletStrategy walletStrategy, Product product) {
        this.walletStrategy = walletStrategy;
        this.product = product;
    }

    public void pay() {
        walletStrategy.pay(product.getProductPrice());
    }
}
