package Moves.Excadrill;

import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove {
    public BrutalSwing(double pow, double acc) {
        super(Type.DARK, pow, acc);
    }

    @Override
    protected String describe() {
        String[] s=getClass().toString().split("\\.");
        return "использует " + s[s.length-1];
    }
}

