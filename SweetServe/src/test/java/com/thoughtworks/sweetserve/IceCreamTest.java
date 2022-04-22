package com.thoughtworks.sweetserve;

import org.junit.jupiter.api.Test;

class IceCreamTest {

    @Test
    void shouldReturnTheCostBasedOnTheFlavourAndTheNoOfScoopsChosenByTheCustomer() {
        IceCream iceCream = new Chocolate(2);
        System.out.println(iceCream.description());
        System.out.println("Cost : Rs."+iceCream.cost());
    }
}