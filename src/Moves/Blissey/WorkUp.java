package Moves.Blissey;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e =new Effect().stat(Stat.ATTACK, 1);
        p.addEffect(e);
        Effect c =new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(c);

    }
    @Override
    protected String describe() {
        String[] s=getClass().toString().split("\\.");
        return "использует " + s[s.length-1];
    }
}

