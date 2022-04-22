package com.thoughtworks.sweetserve;

import org.junit.jupiter.api.Test;

class IceCreamTest {

    @Test
    void shouldReturnTheCostBasedOnTheFlavourAndTheNoOfScoopsChosenByTheCustomer() {
        IceCream iceCream = new Chocolate(2);
        System.out.println(iceCream.description());
        System.out.println("Cost : Rs."+iceCream.cost());
    }
    @Test
    void shouldReturnTheCostBasedOnTheFlavourAndTheNoOfScoopsWithToppingChosenByTheCustomer() {
        IceCream iceCream = new Vanilla(1);

        iceCream = new ChocoChip(iceCream);
        iceCream = new Oreos(iceCream);
        iceCream = new ChocoChip(iceCream);

        System.out.println(iceCream.description());
        System.out.println("Cost : Rs."+iceCream.cost());
    }
}