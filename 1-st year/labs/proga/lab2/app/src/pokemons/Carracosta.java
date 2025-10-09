package pokemons;

import attacks.special.FocusBlast;

public final class Carracosta extends Tirtouga {
    final double BASE_HP = 74;
    final double BASE_ATTACK = 108;
    final double BASE_DEFENCE = 133;
    final double BASE_SPECIAL_ATTACK = 83;
    final double BASE_SPECIAL_DEFENSE = 65;
    final double BASE_SPEED = 32;

    public Carracosta(String name, int level) {
        super(name, level);

        super.setStats(BASE_HP, BASE_ATTACK, BASE_DEFENCE, BASE_SPECIAL_ATTACK, BASE_SPECIAL_DEFENSE, BASE_SPEED);

        super.addMove(new FocusBlast());
    }
}
