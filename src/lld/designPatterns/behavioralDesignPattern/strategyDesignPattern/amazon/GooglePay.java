package lld.designPatterns.behavioralDesignPattern.strategyDesignPattern.amazon;

public class GooglePay implements WalletStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying by google pay...");
        System.out.println("amount: " + amount);
    }
}
