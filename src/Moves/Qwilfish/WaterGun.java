package Moves.Qwilfish;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class WaterGun extends SpecialMove {
    public WaterGun(double pow, double acc) {
        super(Type.WATER, pow, acc);

    }

    @Override
    protected String describe() {
        String[] s = getClass().toString().split("\\.");
        return "использует " + s[s.length - 1];
    }
}
