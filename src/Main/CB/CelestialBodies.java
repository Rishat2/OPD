package Main.CB;

import Main.I.gsName;
import Main.I.gsSize;

public abstract class CelestialBodies implements gsName, gsSize {
    public double DistanceToEarth=0;
    protected String name;
    protected double size=0;
    protected CelestialBodies(String name, double size, double DistanceToEarth){
        if(size<0){
            System.out.println("Размер не может быть отрицательным");
        }
        else{
            this.size=size;
        }
        if(DistanceToEarth<0){
            System.out.println("Дистанция до земли не может быть отрицательной");
        }
        else{
            this.DistanceToEarth=DistanceToEarth;
        }

        //this.DistanceToEarth=DistanceToEarth;
        this.name=name;
        //this.size=size;
    }
}
