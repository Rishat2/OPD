package Pokemons;
import Moves.Chansey.*;
import ru.ifmo.se.pokemon.*;

public class Chansey extends Pokemon {
    public Chansey(String name, int level) {
        super(name,level);
        super.setType(Type.NORMAL);
        super.setStats(250, 5, 5, 35, 105, 50);
        Refresh refresh=new Refresh(0, 0);
        WorkUp workup= new WorkUp(0, 0);
        MudBomb mudbomb=new MudBomb(65, 85);
        super.setMove(refresh, workup,mudbomb);
    }
}
