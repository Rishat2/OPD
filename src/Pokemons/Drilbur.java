package Pokemons;
import Moves.Drilbur.*;
import ru.ifmo.se.pokemon.*;

public class Drilbur extends Pokemon {
    public Drilbur(String name, int level) {
        super(name,level);
        super.setType(Type.GROUND);
        super.setStats(60, 85, 40, 30, 45, 68);
        HoneClaws honeclaws=new HoneClaws(0, 0);
        PoisonJab poisonjab=new PoisonJab(80, 100);
        RockSlide rockslide=new RockSlide(75, 90);
        super.setMove(honeclaws, poisonjab, rockslide);
    }
}
