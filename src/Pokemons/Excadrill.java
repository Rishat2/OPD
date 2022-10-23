package Pokemons;

import Moves.Excadrill.*;
import ru.ifmo.se.pokemon.*;

public class Excadrill extends Pokemon {
    public Excadrill(String name, int level) {
        super(name, level);
        super.setType(Type.GROUND, Type.STEEL);
        super.setStats(110, 135, 60, 50, 65, 88);
        HoneClaws honeclaws=new HoneClaws(0, 0);
        PoisonJab poisonjab=new PoisonJab(80, 100);
        RockSlide rockslide=new RockSlide(75, 90);
        BrutalSwing brutalswing=new BrutalSwing(60, 100);
        super.setMove(honeclaws, poisonjab, rockslide, brutalswing);
    }
}
