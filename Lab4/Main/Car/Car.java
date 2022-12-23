package Main.Car;

import Main.Exception.CreateException;
import java.lang.Object;
import java.util.ArrayList;

abstract public class Car {
    private int number;
    protected Car(int number){
        this.number=number;
        //numbers.add(String.valueOf(number));
    }
    public int getNumber(){
        return number;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car c = (Car) obj;
        if (c.number == this.number) {
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Номер машины "+number;
    }
}
