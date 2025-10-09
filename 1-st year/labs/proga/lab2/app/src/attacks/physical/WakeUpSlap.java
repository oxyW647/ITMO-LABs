package attacks.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public final class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap() {
        super(Type.FIGHTING, 70, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getCondition() == Status.SLEEP) {
            pokemon.setMod(Stat.HP, -70);
        }
    }

    @Override
    protected String describe() {
        return "использует способность Wake-Up Slap";
    }

}
