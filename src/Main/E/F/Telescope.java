package Main.E.F;



import Main.E.Equipments;

import java.util.Objects;

public class Telescope extends Equipments {
    private double OpticalPower;
    public Telescope(String name, double size, double OpticalPower){
        super(size, name);
        if(OpticalPower<0){
            System.out.println("Размер не может быть отрицательным");
        }
        else{
            this.OpticalPower=OpticalPower;
        }
        //this.OpticalPower=OpticalPower;
    }
    public void setName(String name) {
        this.name=name;
    }


    public String getName() {
        return name;
    }


    public void setSize(double size) {

        if(size<0){
            System.out.println("Размер не может быть отрицательным");
        }
        else{
            this.size=size;
        }
    }

    public double getSize() {
        return size;
    }
    public String setOpticalPower(double OpticalPower){
        if(OpticalPower<0){
            return "Размер не может быть отрицательным";
        }
        if(OpticalPower>this.OpticalPower){
            return "Оптическая сила успешно увеличена";
        }
        if(OpticalPower<this.OpticalPower){
            return "Оптическая сила успешно уменьшена";
        }
        return "Оптическая сила не изменилась";
    }
    public double getOpticalPower(){
        return OpticalPower;
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Telescope t=(Telescope) obj;
        if(t.name==this.name&&t.size==this.size&&t.OpticalPower==this.OpticalPower){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.size,this.OpticalPower);
    }
    @Override
    public String toString(){
        return "Название телескопа: "+this.name+"\nРазмер: "+this.size+"м\nОптическая сила: "+this.OpticalPower+"D";
    }

}
