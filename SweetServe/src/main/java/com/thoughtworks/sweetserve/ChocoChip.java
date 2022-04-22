package com.thoughtworks.sweetserve;

public class ChocoChip extends Topping {
    IceCream iceCream;

    public ChocoChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String description() {
        return iceCream.description() + ", Choco chip";
    }

    @Override
    public float cost() {
        return 10 + iceCream.cost();
    }
}
