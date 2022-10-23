package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Move extends SpecialMove {
    public Move(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
    }
    @Override
    protected String describe() {
        String[] s=this.getClass().toString().split("\\.");
        return "использует " + s[s.length-1];
    }
}
