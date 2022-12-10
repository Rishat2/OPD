package Main.CB.F;

import Main.CB.CelestialBodies;

import java.util.Objects;

public class Satellites extends CelestialBodies {
    private double[] SizeOfCraters;
    private int NumberOfCraters;
    public double[] Random;
    public Satellites(String name, double size, double DistanceToEarth, int NumberOfCraters){
        super(name,size,DistanceToEarth);
        this.NumberOfCraters=NumberOfCraters;
        SizeOfCraters=new double[NumberOfCraters];
        Random=new double[NumberOfCraters];
        for(int i=0;i<Random.length;i++) {
            Random[i] = Math.random() * 140;
        }
    }
    public int getNumberOfCraters(){
        return NumberOfCraters;
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
    public String setSizeOfCraters(int number,int size){
        if(size<0){
            return "Размер не может быть отрицательным";
        }
        if(size>140){
            return "Таких больших кратеров не бывает";
        }
        if(number>NumberOfCraters){
            return "Кратеров всего "+String.valueOf(NumberOfCraters);
        }
        SizeOfCraters[number-1]=size;
        return "Размер кратера номер "+number+ "успешно записан";
    }
    public String getSizeOfCraters(int number){
        if(number<=0){
            return "Номер кратера должен быть положительный";
        }
        if(number>NumberOfCraters){
            return "Кратеров всего "+String.valueOf(NumberOfCraters);
        }
        if(SizeOfCraters[number-1]==0){
            return "Размер кратера номер "+String.valueOf(number)+" неизвестен";
        }
        return "Размер кратера номер "+String.valueOf(number)+" равен "+String.valueOf(SizeOfCraters[number-1]);
    }
    public double getSizeOfCrater(int number){
        if(number>NumberOfCraters||number<0){
            return -1;
        }
        if(SizeOfCraters[number-1]==0){
            return 0;
        }
        return SizeOfCraters[number-1];
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Satellites t=(Satellites) obj;
        if(t.Random.hashCode()==this.Random.hashCode()){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.Random);
    }
    @Override
    public String toString(){
        return "Название спутника: "+this.name+"\nРазмер: "+this.size+"м\nРасстояние до земли: "+this.DistanceToEarth+"м";
    }
}
