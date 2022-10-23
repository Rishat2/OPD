package Pokemons;
import Moves.Blissey.*;
import ru.ifmo.se.pokemon.*;

public class Blissey extends Pokemon {
    public Blissey(String name, int level) {
        super(name,level);
        super.setType(Type.NORMAL);
        super.setStats(255, 10, 10, 75, 135, 55);
        Refresh refresh=new Refresh(0, 0);
        WorkUp workup= new WorkUp(0, 0);
        MudBomb mudbomb=new MudBomb(65, 85);
        Rest rest=new Rest(0, 0);
        super.setMove(refresh, workup,mudbomb, rest);
    }
}