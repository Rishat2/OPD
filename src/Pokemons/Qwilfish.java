package Pokemons;

import Moves.Qwilfish.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Qwilfish extends Pokemon {
    public Qwilfish(String name, int level) {
        super(name,level);
        super.setType(Type.WATER,Type.POISON);
        super.setStats(65, 95, 85, 55, 55, 85);
        WaterGun watergun = new WaterGun(40, 100);
        Haze haze=new Haze(0, 0);
        Astonish astonish=new Astonish(30, 100);
        Swagger swagger=new Swagger(0, 85);
        super.setMove(swagger, astonish, haze, watergun);

    }
}
