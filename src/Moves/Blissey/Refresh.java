package Moves.Blissey;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Status.*;

public class Refresh extends StatusMove {
    public Refresh(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (p.getCondition() == PARALYZE || p.getCondition() == BURN || p.getCondition() == POISON) {
            Effect e =new Effect().condition(NORMAL);
            p.addEffect(e);

        }
    }
    @Override
    protected String describe() {
        String[] s=getClass().toString().split("\\.");
        return "использует " + s[s.length-1];
    }
}