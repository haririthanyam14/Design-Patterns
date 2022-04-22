package com.thoughtworks.pokemon;


public class Charmander extends FirePokemon {

    public Charmander() {
        evolveBehaviour = new EvolveByStone();
    }

    @Override
    public String display() {
        return "I'm a Charmander";
    }
}