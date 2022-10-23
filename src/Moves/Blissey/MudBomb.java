package Moves.Blissey;

import Pok.Laba2;
import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {
    public MudBomb(double pow, double acc) {
        super(Type.GROUND, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Laba2.chance(0.3)) {
            Effect e = new Effect().stat(Stat.ACCURACY, 1);
            p.addEffect(e);
        }
    }
    @Override
    protected String describe() {
        String[] s=getClass().toString().split("\\.");
        return "использует " + s[s.length-1];
    }
}