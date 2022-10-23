package Moves.Drilbur;

import ru.ifmo.se.pokemon.*;

public class HoneClaws extends StatusMove {
    public HoneClaws(double pow, double acc) {
        super(Type.DARK, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
            Effect e =new Effect().stat(Stat.ATTACK, 1);
            p.addEffect(e);
            Effect c =new Effect().stat(Stat.ACCURACY, 1);
            p.addEffect(c);
    }
    @Override
    protected String describe() {
        String[] s=getClass().toString().split("\\.");
        return "использует " + s[s.length-1];
    }
}
