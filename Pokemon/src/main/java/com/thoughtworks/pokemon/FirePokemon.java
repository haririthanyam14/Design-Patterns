package com.thoughtworks.pokemon;

public abstract class FirePokemon {
    EvolveBehaviour evolveBehaviour;
    public String attack() {
        return "Attackkk!";
    }

    public String defend() {
        return "Observe opponent - so defend";
    }

    public String evolvePokemon() {
        return evolveBehaviour.evolve();
    }
    public abstract String display();
}
