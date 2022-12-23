package Main.Equipment;

import Main.Interface.gsName;
import Main.Interface.gsSize;

public abstract class Equipments implements gsName, gsSize {
    protected String name;
    protected double size;
    protected Equipments(double size, String name){
        if(size<0){
            System.out.println("Размер не может быть отрицательным");
        }
        else{
            this.size=size;
        }
        this.name=name;
    }
}
