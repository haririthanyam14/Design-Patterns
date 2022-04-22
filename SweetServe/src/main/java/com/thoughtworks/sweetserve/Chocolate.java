package com.thoughtworks.sweetserve;

public class Chocolate extends IceCream{

    public Chocolate(int scoops) {
        this.scoops = scoops;
    }

    @Override
    public String description() {
        return "You have chosen Chocolate with "+scoops+" scoops";
    }

    @Override
    public float cost(){
        return scoops * 75;
    }

}
