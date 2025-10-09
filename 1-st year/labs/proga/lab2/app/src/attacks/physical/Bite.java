package attacks.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Bite extends PhysicalMove {
    public Bite() {
        super(Type.DARK, 60, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() > 0.7) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует способность Bite";
    }
}
