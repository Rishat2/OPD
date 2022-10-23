package Moves.Blissey;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e=new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(e);
        if(p.getHP()<255){
            p.setStats(255, p.getStat(Stat.ATTACK), p.getStat(Stat.DEFENSE), p.getStat(Stat.SPECIAL_ATTACK), p.getStat(Stat.SPECIAL_DEFENSE), p.getStat(Stat.SPEED));
        }
    }
    @Override
    protected String describe() {
        String[] s=getClass().toString().split("\\.");
        return "использует " + s[s.length-1];
    }
}

