package main.pokemons;

import main.moves.DoubleTeamMove;
import main.moves.WorkUpMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class HappinyPokemon extends Pokemon {
    public HappinyPokemon(String name, int lvl) {
        super(name, lvl);
        setStats(100, 5, 5, 15, 65, 30);
        setType(Type.NORMAL);
        setMove(new DoubleTeamMove(), new WorkUpMove());
    }
}