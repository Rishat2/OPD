package Main.Car.Cars;

import Main.Car.Car;
import Main.Exception.CreateException;
import Main.Exception.OtricException;

import java.util.ArrayList;

public class AircraftHydromotor extends Car {
    private Engine engine;
    private static ArrayList<String> numbers=new ArrayList<>(10);

    private AircraftHydromotor(int number, double power, String name){
        super(number);
        numbers.add(String.valueOf(number));
        engine =new Engine(name,power);
    }
    static public AircraftHydromotor createAircraftHydromotor(int number, double power, String name )throws CreateException, OtricException {
        if(number<0){
            throw new OtricException("Номер машины не может быть отрицательным");
        }
        if(AircraftHydromotor.getNumbers().contains(String.valueOf(number))){
            throw new CreateException("Машина с таким номером уже есть");
        }
        AircraftHydromotor s=new AircraftHydromotor(number,power,name);
        return s;
    }
    public static ArrayList<String> getNumbers(){
        return numbers;
    }
    class Engine{
        private String name;
        private double power;
        Engine(String name,double power){
            this.name=name;
            this.power=power;
        }
        public String getName(){
            return name;
        }

        public double getPower() {
            return power;
        }
    }
    public Engine getEngine(){
        return engine;
    }

    public static class CalcHeight{
        private String name;
        private double height;
        public CalcHeight(String name, double height){
            this.name=name;
            this.height=height;
        }
        @Override
        public String toString(){
            return "Двигатель "+name+" позволяет подняться на ввысоту "+String.valueOf(height);
        }
    }
    public static CalcHeight calculate(Engine e){
        double height=e.getPower()*5;
        return new CalcHeight(e.getName(),height);
    }
}
