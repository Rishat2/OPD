package Main.CelestialBodies.Planets;

import Main.Interface.gsName;
import Main.Interface.gsSize;

import java.util.ArrayList;

public class City implements gsName, gsSize {
    private String name;
    private int population;
    private int capacity;
    private double size;
    //static int counter=0;
    private ArrayList<String> people;
    private ArrayList<Object> street;

    public City(String name, double size, int capacity) {
        this.capacity=capacity;
        this.size = size;
        this.name = name;
    }

    public ArrayList<String> getPeople() {
        return people;
    }

    public ArrayList<Object> getStreet() {
        return street;
    }
    public void addStreet(Street s){
        if(this.size>this.street.size()){
            street.add(s);
            population+=s.getPopulation();
            System.out.println("Улица успешно добавлена");
        }
        else{
            System.out.println("Город полностью занят улицу добавить нельзя!");
        }
    }
    public String pollStreet(Street s){
        for(int i=0;i<street.size();i++) {
            if (s.equals(street.get(i))) {
                street.remove(s);
                population-=s.getPopulation();
                return "Улица успешно уничтожена";
            }
        }
        return "Этой улицы нет в городе";
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
}
