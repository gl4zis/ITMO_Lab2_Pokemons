package main.pokemons;

import main.moves.IceBeamMove;

public class BlisseyPokemon extends ChanseyPokemon {
    public BlisseyPokemon(String name, int lvl) {
        super(name, lvl);
        setStats(255, 10, 10, 75, 135, 55);
        addMove(new IceBeamMove());
    }
}