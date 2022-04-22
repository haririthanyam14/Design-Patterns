package com.thoughtworks.pokemon;

public class NoEvolution implements EvolveBehaviour{
    @Override
    public String evolve() {
        return "No more evolution";
    }
}
