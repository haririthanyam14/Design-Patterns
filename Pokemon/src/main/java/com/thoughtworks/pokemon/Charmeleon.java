package com.thoughtworks.pokemon;


public class Charmeleon extends FirePokemon {

    public Charmeleon() {
        evolveBehaviour = new EvolveByLevelUp();
    }

    @Override
    public String display() {
        return "I'm a Charmeleon";
    }
}
