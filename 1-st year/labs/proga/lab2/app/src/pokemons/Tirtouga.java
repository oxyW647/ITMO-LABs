package pokemons;

import attacks.physical.Bite;
import attacks.special.HydroPump;
import attacks.status.ShellSmash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tirtouga extends Pokemon {
    final double BASE_HP = 54;
    final double BASE_ATTACK = 78;
    final double BASE_DEFENCE = 103;
    final double BASE_SPECIAL_ATTACK = 53;
    final double BASE_SPECIAL_DEFENSE = 45;
    final double BASE_SPEED = 22;

    public Tirtouga(String name, int level) {
        super(name, level);

        super.setType(Type.WATER, Type.ROCK);

        super.setStats(BASE_HP, BASE_ATTACK, BASE_DEFENCE, BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED);

        super.addMove(new ShellSmash());
        super.addMove(new HydroPump());
        super.addMove(new Bite());
    }
}
