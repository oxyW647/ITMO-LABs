package attacks.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import utils.Probability;

public final class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 0.7);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Probability.gen(0.3)) {
            Effect.freeze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует способность Thunder";
    }
}
