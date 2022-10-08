package main.pokemons;

import main.moves.ShadowBallMove;

public class MeowsticMalePokemon extends EspurrPokemon {
    public MeowsticMalePokemon(String name, int lvl) {
        super(name, lvl);
        setStats(74, 48, 76, 83, 81, 104);
        addMove(new ShadowBallMove());
    }
}