package Main.P;

import Main.CB.F.Planets;
import Main.I.gsName;

public abstract class Person implements gsName {
    protected String name;
    private String planet;
    private String place;
    {
        name="nobody";
        place="nowhere";
    }
    protected Person(String name) {
        this.name = name;
    }
    public void SettleDown(Planets planet){
        Planets p= planet;
        if(this.planet!=null){
            System.out.println("Персонаж ужи живет на планете "+this.planet);
        }
        else {
        p.setPopulation(p.getPopulation() + 1);
        this.planet=p.getName();
    }
    }
    public void Come(City city){
        place= String.valueOf(city);
        System.out.println("Персонаж прибыл в город "+place);
    }
    protected String getPlace(){
        return place;
    }
    public String getPlanet(){
        return planet;
    }
    public void Leave(City city){
        if (place==String.valueOf(city)) {
            place = "nowhere";
            System.out.println("Персонаж успешно покинул город "+String.valueOf(city));
        }
        else{
            System.out.println("Персонаж не может покинуть город "+String.valueOf(city)+" он находится в "+place);
        }
    }
    @Override
    public String toString(){
        return "Персонаж "+name+" Находится в городе "+place;
    }

}
