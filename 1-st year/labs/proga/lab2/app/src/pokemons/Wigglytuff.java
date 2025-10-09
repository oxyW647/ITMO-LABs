package pokemons;

import attacks.special.Thunder;

public final class Wigglytuff extends Jigglypuff {
    final double BASE_HP = 140;
    final double BASE_ATTACK = 70;
    final double BASE_DEFENCE = 45;
    final double BASE_SPECIAL_ATTACK = 85;
    final double BASE_SPECIAL_DEFENSE = 50;
    final double BASE_SPEED = 45;

    public Wigglytuff(String name, int level) {
        super(name, level);

        super.setStats(BASE_HP, BASE_ATTACK, BASE_DEFENCE, BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED);

        super.addMove(new Thunder());
    }

}
