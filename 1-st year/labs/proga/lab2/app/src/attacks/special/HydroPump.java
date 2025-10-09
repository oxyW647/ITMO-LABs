package attacks.special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class HydroPump extends SpecialMove {
    public HydroPump() {
        super(Type.WATER, 110, 0.8);
    }

    @Override
    protected String describe() {
        return "использует способность Hydro Pump";
    }
}
