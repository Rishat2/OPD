package Main.CelestialBodies.Planets;

import Main.Interface.gsName;
import Main.Interface.gsSize;
import Main.Person.Person;

import java.util.ArrayList;

public class Street implements gsName, gsSize {
    private int population;
    String name;
    private int capacity=0;
    private double size;
    private ArrayList<Object> house;

    Street(double size, String name,int capacity) {
        this.capacity=capacity;
        this.size = size;
        this.name = name;
    }
    public void addHouse(House h){
        if(this.capacity>this.house.size()){
            house.add(h);
            population+=h.getTenants();
            System.out.println("Дом успешно добавлен");
        }
        else{
            System.out.println("Улица полностью занята дом добавить нельзя!");
        }
    }
    public int getPopulation(){return population;}
    public String pollHouse(House h){
        for(int i=0;i<house.size();i++) {
            if (h.equals(house.get(i))) {
                House h1= (House) house.get(i);
                for(int j=h1.getTenants()-1;j>-1;j--){
                    h1.pollPerson((Person) h1.getPerson().get(j));
                }
                house.remove(h);
                population-=h.getTenants();
                return "Дом успешно снесен";
            }
        }
        return "Этого дома здесь нет";
    }

    public ArrayList<Object> getHouse() {
        return house;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Street t=(Street) obj;
        if(t.name==this.name&&this.size==t.size){
            return true;
        }
        return false;
    }
}

