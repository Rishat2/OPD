package Main.Car.Cars;

import Main.Car.Car;
import Main.Exception.CreateException;
import Main.Exception.OtricException;

import java.util.ArrayList;

final public class SpiralWalker extends Car {
    private int numberofspirals;
    private static ArrayList<String> numbers=new ArrayList<>(10);
    private SpiralWalker(int number, int numberofspirals){
        super(number);
        numbers.add(String.valueOf(number));
        this.numberofspirals=numberofspirals;
    }
    static public SpiralWalker createSpiralWalker(int number,int numberofspirals )throws CreateException, OtricException {
        if(number<0){
            throw new OtricException("Номер машины не может быть отрицательным");
        }
        if(SpiralWalker.getNumbers().contains(String.valueOf(number))){
            throw new CreateException("Машина с таким номером уже есть");
        }
        SpiralWalker s=new SpiralWalker(number,numberofspirals);
        return s;
    }
    public static ArrayList<String> getNumbers(){
        return numbers;
    }
    public int getNumberofspirals(){
        return numberofspirals;
    }
}
