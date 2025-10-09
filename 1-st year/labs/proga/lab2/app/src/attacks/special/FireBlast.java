package attacks.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) {
            Effect.burn(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует способность Fire Blast";
    }
}
