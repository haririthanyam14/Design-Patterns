package com.thoughtworks.pokemon;


public class Charizard extends FirePokemon{

    public Charizard() {
        evolveBehaviour = new NoEvolution();
    }

    @Override
    public String display() {
        return "I'm a Charizard";
    }
}
