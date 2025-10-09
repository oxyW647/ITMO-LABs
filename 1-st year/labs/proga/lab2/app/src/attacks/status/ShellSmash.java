package attacks.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class ShellSmash extends StatusMove {
    public ShellSmash() {
        super(Type.NORMAL, 0, Double.POSITIVE_INFINITY);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.DEFENSE, -1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);

        pokemon.setMod(Stat.ATTACK, +2);
        pokemon.setMod(Stat.SPECIAL_ATTACK, +2);
        pokemon.setMod(Stat.SPEED, +2);
    }

    @Override
    protected String describe() {
        return "использует способность Shell Smash";
    }
}
