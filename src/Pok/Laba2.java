package Pok;

import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
public class Laba2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Drilbur drilbur = new Drilbur("Mole", 8);
        Qwilfish qwilfish = new Qwilfish("Toxin", 2);
        Excadrill excadrill=new Excadrill("Digger", 28);
        Happiny happiny=new Happiny("Pinky", 9);
        Chansey chansey=new Chansey("Flower", 9);
        Blissey blissey=new Blissey("Happy", 9);
        b.addAlly(drilbur);
        b.addAlly(chansey);
        b.addAlly(blissey);
        b.addFoe(qwilfish);
        b.addFoe(excadrill);
        b.addFoe(happiny);
        b.go();
    }
    public static boolean chance(double d){
        return d>Math.random();
    }
}
