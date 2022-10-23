package Moves.Excadrill;

import Pok.Laba2;
import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(double pow, double acc) {
        super(Type.ROCK, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Laba2.chance(0.3)) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        String[] s=getClass().toString().split("\\.");
        return "использует " + s[s.length-1];
    }
}
