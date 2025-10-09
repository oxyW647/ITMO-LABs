package pokemons;

import attacks.special.FireBlast;
import attacks.special.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Igglybuff extends Pokemon {
    final double BASE_HP = 90;
    final double BASE_ATTACK = 30;
    final double BASE_DEFENCE = 15;
    final double BASE_SPECIAL_ATTACK = 40;
    final double BASE_SPECIAL_DEFENSE = 20;
    final double BASE_SPEED = 15;

    public Igglybuff(String name, int level) {
        super(name, level);

        super.setType(Type.FAIRY, Type.NORMAL);

        super.setStats(BASE_HP, BASE_ATTACK, BASE_DEFENCE, BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED);

        super.addMove(new Psychic());
        super.addMove(new FireBlast());
    }
}
