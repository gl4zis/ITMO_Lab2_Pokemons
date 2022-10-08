package main;

import main.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new MeowsticMalePokemon("Егор", 1);
        Pokemon p2 = new EspurrPokemon("Кирилл", 1);
        Pokemon p3 = new ShucklePokemon("Рома", 60);
        Pokemon p4 = new HappinyPokemon("Миша", 1);
        Pokemon p5 = new ChanseyPokemon("Инна", 1);
        Pokemon p6 = new BlisseyPokemon("Олеся", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        try {
            b.go();
        } catch (Exception e) {
            System.out.println("В командах не хватает участников");
        }
    }
}