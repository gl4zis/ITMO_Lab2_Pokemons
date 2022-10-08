
package main.pokemons;

import main.moves.MudSlapMove;
import main.moves.RockPolishMove;
import main.moves.StoneEdgeMove;
import main.moves.WithdrawMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ShucklePokemon extends Pokemon {
    public ShucklePokemon(String name, int lvl) {
        super(name, lvl);
        setStats(20, 10, 230, 10, 230, 5);
        setType(Type.BUG, Type.ROCK);
        setMove(new WithdrawMove(), new MudSlapMove(), new StoneEdgeMove(), new RockPolishMove());
    }
}