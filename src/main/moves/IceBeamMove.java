package main.moves;

import ru.ifmo.se.pokemon.*;

public class IceBeamMove extends SpecialMove {
    public IceBeamMove() {
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            Effect.freeze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Ice Beam";
    }
}
