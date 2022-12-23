package Main.Car.Cars;

import Main.Car.Car;
import Main.Exception.CreateException;
import Main.Exception.OtricException;

import java.util.ArrayList;

public class AllterrainVehicle extends Car {
    private double tracksize;
    private static ArrayList<String> numbers=new ArrayList<>(10);
    AllterrainVehicle(int number, double tracksize){
        super(number);
        this.tracksize=tracksize;
    }
    static public AllterrainVehicle createAllterrainVehicle(int number, double tracksize )throws CreateException, OtricException {
        if(number<0){
            throw new OtricException("Номер машины не может быть отрицательным");
        }
        if(AllterrainVehicle.getNumbers().contains(String.valueOf(number))){
            throw new CreateException("Машина с таким номером уже есть");
        }
        AllterrainVehicle s=new AllterrainVehicle(number,tracksize);
        return s;
    }
    public static ArrayList<String> getNumbers() {
        return numbers;
    }
    public double getTracksize(){
        return tracksize;
    }
}
