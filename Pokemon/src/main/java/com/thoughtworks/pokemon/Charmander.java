package com.thoughtworks.pokemon;


public class Charmander extends FirePokemon implements Evolve{

    @Override
    public String evolve() {
        return "Evolve Pokemon to Charmeleon";
    }

    @Override
    public String display() {
        return "I'm a Charmander";
    }
}