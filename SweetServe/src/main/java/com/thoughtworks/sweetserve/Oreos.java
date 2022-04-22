package com.thoughtworks.sweetserve;

public class Oreos extends Topping {
    IceCream iceCream;

    public Oreos(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String description() {
        return iceCream.description() + ", Oreos";
    }

    @Override
    public float cost() {
        return 15 + iceCream.cost();
    }
}
