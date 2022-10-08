package main.pokemons;

import main.moves.DarkPulseMove;
import main.moves.EnergyBallMove;
import main.moves.WorkUpMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class EspurrPokemon extends Pokemon {
    public EspurrPokemon(String name, int lvl) {
        super(name, lvl);
        setStats(62, 48, 54, 63, 60, 68);
        setType(Type.PSYCHIC);
        setMove(new EnergyBallMove(), new WorkUpMove(), new DarkPulseMove());
    }
}