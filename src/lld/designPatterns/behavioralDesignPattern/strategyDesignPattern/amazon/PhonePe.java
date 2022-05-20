package lld.designPatterns.behavioralDesignPattern.strategyDesignPattern.amazon;

public class PhonePe implements WalletStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying by PhonePe...");
        System.out.println("amount: " + amount);
    }
}
