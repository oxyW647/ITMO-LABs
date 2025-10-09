import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

import java.util.Random;

import pokemons.Carracosta;
import pokemons.Igglybuff;
import pokemons.Shaymin;
import pokemons.Tirtouga;
import pokemons.Wigglytuff;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Pokemon p1 = new Shaymin("Антон Назаров", random.nextInt(1, 16));
        Pokemon p2 = new Wigglytuff("Александр Ильин", random.nextInt(1, 16));
        Pokemon p3 = new Carracosta("Роман Сакутин", random.nextInt(1, 16));

        Pokemon e1 = new Tirtouga("Леся Набока", random.nextInt(1, 16));
        Pokemon e2 = new Igglybuff("Алексей Гладков", random.nextInt(1, 16));
        Pokemon e3 = new Pokemon("Влад Мишустин", random.nextInt(1, 16));

        Battle b = new Battle();

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(e1);
        b.addFoe(e2);
        b.addFoe(e3);

        b.go();
    }
}
