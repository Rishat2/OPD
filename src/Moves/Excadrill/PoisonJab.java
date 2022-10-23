package Moves.Excadrill;

import Pok.Laba2;
import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab(double pow, double acc) {
        super(Type.POISON, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Laba2.chance(0.3)){
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        String[] s=getClass().toString().split("\\.");
        return "использует " + s[s.length-1];
    }
}
