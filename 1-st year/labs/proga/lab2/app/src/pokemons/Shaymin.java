package pokemons;

import attacks.special.EnergyBall;
import attacks.special.MagicalLeaf;
import attacks.status.Growth;
import attacks.status.SweetScent;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Shaymin extends Pokemon {
    final double BASE_HP = 100;
    final double BASE_ATTACK = 100;
    final double BASE_DEFENCE = 100;
    final double BASE_SPECIAL_ATTACK = 100;
    final double BASE_SPECIAL_DEFENSE = 100;
    final double BASE_SPEED = 100;

    public Shaymin(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS);

        super.setStats(BASE_HP, BASE_ATTACK, BASE_DEFENCE, BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED);

        super.addMove(new Growth());
        super.addMove(new MagicalLeaf());
        super.addMove(new SweetScent());
        super.addMove(new EnergyBall());
    }
}