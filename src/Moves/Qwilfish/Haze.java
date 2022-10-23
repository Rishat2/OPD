package Moves.Qwilfish;

import ru.ifmo.se.pokemon.*;

public class Haze extends StatusMove {
    public Haze(double pow, double acc) {
        super(Type.ICE, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e;
        e = new Effect();
        e.clear();
        p.addEffect(e);
    }
    @Override
    protected String describe() {
        String[] s=getClass().toString().split("\\.");
        return "does " + s[s.length-1];
    }
}
