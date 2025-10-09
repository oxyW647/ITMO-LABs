package pokemons;

import attacks.physical.WakeUpSlap;

public class Jigglypuff extends Igglybuff {
    final double BASE_HP = 115;
    final double BASE_ATTACK = 45;
    final double BASE_DEFENCE = 20;
    final double BASE_SPECIAL_ATTACK = 45;
    final double BASE_SPECIAL_DEFENSE = 25;
    final double BASE_SPEED = 20;

    public Jigglypuff(String name, int level) {
        super(name, level);

        super.setStats(BASE_HP, BASE_ATTACK, BASE_DEFENCE, BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED);

        super.addMove(new WakeUpSlap());
    }
}
