package com.thoughtworks.pokemon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
        Charmander charmander =  new Charmander();
        Charmeleon charmeleon =  new Charmeleon();

        assertEquals("Evolve Pokemon to Charmeleon", charmander.evolve());
        assertEquals("Evolve Pokemon to Charizard", charmeleon.evolve());
    }

//    Compilation error as Charizard no longer has the evolve behaviour
//    @Test
//    public void shouldNotEvolve() {
//        FirePokemon charizard =  new Charizard();
//
//        assertNull(charizard.evolve());
//    }

}
