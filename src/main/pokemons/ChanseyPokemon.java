package main.pokemons;

import main.moves.PresentMove;

public class ChanseyPokemon extends HappinyPokemon {
    public ChanseyPokemon(String name, int lvl) {
        super(name, lvl);
        setStats(250, 5, 5, 35, 105, 50);
        addMove(new PresentMove());
    }
}