package Pokemons;
import Moves.Happiny.*;
import ru.ifmo.se.pokemon.*;

public class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name,level);
        super.setType(Type.NORMAL);
        super.setStats(100, 5, 5, 15, 65, 30);
        Refresh refresh=new Refresh(0, 0);
        WorkUp workup=new WorkUp(0, 0);
        super.setMove(refresh, workup);
    }
}
