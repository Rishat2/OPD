package Main.Person;

import Main.Interface.gsName;
public abstract class Person implements gsName {
    protected String name;
    private String planet;
    private String adress;

    {
        name="nobody";
    }
    protected Person(String name) {
        this.name = name;
    }
    public  void settle(String adress){
        this.adress=adress;
    }
    public void Notsettle(){adress=null;}
    /*public void SettleDown(Planets planet){
        Planets p= planet;
        if(this.planet!=null){
            System.out.println("Персонаж ужe живет на планете "+this.planet);
        }
        else {
        p.setPopulation(p.getPopulation() + 1);
        this.planet=p.getName();
    }
    }*/

    public String getPlanet(){
        return planet;
    }
    @Override
    public String toString(){
        return "Персонаж "+name+" Находится в городе ";
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Person t=(Person) obj;
        if(t.name==this.name&&this.adress==t.adress){
            return true;
        }
        return false;
    }

}
