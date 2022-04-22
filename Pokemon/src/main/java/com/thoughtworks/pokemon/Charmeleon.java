package com.thoughtworks.pokemon;


public class Charmeleon extends FirePokemon implements Evolve{

    @Override
    public String evolve() {
        return "Evolve Pokemon to Charizard";
    }

    @Override
    public String display() {
        return "I'm a Charmeleon";
    }
}
