package main.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class StoneEdgeMove extends PhysicalMove {
    public StoneEdgeMove() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    public double calcCriticalHit(Pokemon pAtt, Pokemon pDeff) {
        if (Math.random() <= 0.125) {
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "использует StoneEdge";
    }
}
