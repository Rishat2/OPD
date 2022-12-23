package Main.Car.Cars;

import Main.Car.Car;
import Main.Exception.CreateException;
import Main.Exception.OtricException;

import java.util.ArrayList;

public class Trumpeter extends Car {
    private double diameter;
    private static ArrayList<String> numbers=new ArrayList<>(10);
    Trumpeter(int number,double diameter){
        super(number);
        this.diameter=diameter;
    }
    static public Trumpeter createTrumpeter(int number, double diameter )throws CreateException, OtricException {
        if(number<0){
            throw new OtricException("Номер машины не может быть отрицательным");
        }
        if(Trumpeter.getNumbers().contains(String.valueOf(number))){
            throw new CreateException("Машина с таким номером уже есть");
        }
        Trumpeter s=new Trumpeter(number,diameter);
        return s;
    }
    public static ArrayList<String> getNumbers() {
        return numbers;
    }
    public double getDiameter(){
        return diameter;
    }
}
