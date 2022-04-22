package com.thoughtworks.pokemon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirePokemonTest {
    @Test
    public void shouldDisplayCharmanderInfo() {
        FirePokemon charmander =  new Charmander();

        assertEquals("I'm a Charmander", charmander.display());
    }

    @Test
    public void shouldDisplayCharmeleonInfo() {
        FirePokemon charmeleon =  new Charmeleon();

        assertEquals("I'm a Charmeleon", charmeleon.display());
    }

    @Test
    public void shouldDisplayCharizardInfo() {
        FirePokemon charizard =  new Charizard();

        assertEquals("I'm a Charizard", charizard.display());
    }

    @Test
    public void shouldEvolvePokemon() {
        FirePokemon charmander =  new Charmander();
        FirePokemon charmeleon =  new Charmeleon();
        charmander.setEvolveBehaviour(new EvolveByLevelUp());
        charmeleon.setEvolveBehaviour(new EvolveByStone());

        assertEquals("Level Up - So evolve", charmander.evolvePokemon());
        assertEquals("Obtained Evolution Stone - So evolve", charmeleon.evolvePokemon());
    }

    @Test
    public void shouldNotEvolve() {
        FirePokemon charizard =  new Charizard();
        charizard.setEvolveBehaviour(new NoEvolution());

        assertEquals("No more evolution",charizard.evolvePokemon());
    }

}
