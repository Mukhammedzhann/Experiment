package Labka;

abstract class DiscountStrategy {
    public abstract double calculateDiscount(double amount);
}

class RegularDiscount extends DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount;
    }
}

class SilverDiscount extends DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.9;
    }
}

class GoldDiscount extends DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.8;
    }
}

class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy, double amount) {
        return strategy.calculateDiscount(amount);
    }
}

