package main.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class PresentMove extends PhysicalMove {

    public PresentMove() {
        super(Type.NORMAL, 0, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        double chance = Math.random();
        if (chance <= 0.4) {
            power = 40;
        } else if (chance <= 0.7) {
            power = 80;
        } else if (chance <= 0.8) {
            power = 120;
        } else {
            power = 0;
        }
        if (power != 0) {
            pokemon.setMod(Stat.HP, (int) Math.round(damage));
        }
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (power == 0) {
            pokemon.setMod(Stat.HP, (int) -Math.round(pokemon.getStat(Stat.HP) / 4));
        }
    }

    @Override
    protected String describe() {
        return "использует Present";
    }
}
