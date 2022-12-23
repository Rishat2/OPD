package Main.Person.Persons.Scientist;

import Main.CelestialBodies.Sattelites.Satellites;
import Main.Equipment.Equipments;
import Main.Equipment.Science.Telescope;
import Main.Person.Person;


import java.util.Objects;

public final class Scientist extends Person {
    private String[] equipments = new String[50];
    private Theorist type;
    private Science area;

    public Scientist(String name, Science science) {
        super(name);
        area = science;
    }
    public String getArea(){
        return String.valueOf(area);
    }
    public String getTheorist(){
        if (type!=null){
        return String.valueOf(type);
    }
        return "Ученый не является астрономом, поэтому не может быть приверженцем никакой теории";
    }
    public String setTheory(Scientist scientist, Theorist type){
        Scientist s= scientist;
        if(s.getArea()=="ASTRONOM"){
            s.type=type;
            return "Теперь ученый-астроном "+s.getName()+" является ученым "+String.valueOf(s.type);
        }
        return "Ученый не является астрономом";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private boolean Content(String s,String[] a){
        for (int i=0;i<a.length;i++){
            if(a[i]==s){
                return true;
            }
        }
        return false;
    }
    public String addEquipment(Equipments equipmen) {
        String equipment=equipmen.getName();
        if (!Content(equipment, equipments)) {
            if (this.equipments[49] ==null) {
                for (int i = 0; i < 50; i++) {
                    if (equipments[i] == null) {
                        equipments[i] = equipment;
                        return "Оборудование " + equipment + " успешно добавлено";
                    }
                }
            }
            else{
                return "Оборудование переполнено "+equipment+" добавить не удалось";
            }
        }
        return "Оборудование "+equipment+" уже есть";
    }
    public String getEquipments(){
        String c=new String();
        for (int i=0;i<50;i++){
            if(equipments[i]!=null){
                c+=equipments[i]+" ";
            }
            else{
                break;
            }
        }
        return c;
    }
    public void WatchTheSatellites(Telescope telescope, Satellites sattelites, int numcrater){
        Telescope t=telescope;
        Satellites s= sattelites;
        for (int i=0;i<1;i++) {
            if (numcrater <= 0) {
                System.out.println("Номер кратера должен быть положительный");
                break;
            }
            if (Content(t.getName(), equipments) == false) {
                System.out.println("У ученого нет этого телескопа");
                break;
            }
            if (t.getOpticalPower() < s.DistanceToEarth / 192200) {
                System.out.println("У этого телескопа недостаточно оптической силы");
                break;
            }
            if (numcrater > s.getNumberOfCraters()) {
                System.out.println("У спутника " + s.getName() + " меньше кратеров");
                break;
            }
            if (s.getSizeOfCrater(numcrater) == 0) {
                System.out.println(s.Random[numcrater - 1]);
                break;
            }
            if (s.getSizeOfCrater(numcrater) != 0) {
                System.out.println(s.getSizeOfCrater(numcrater));
                break;
            }
        }
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Scientist t=(Scientist) obj;
        if(t.name==this.name&&t.area==this.area&&t.type==this.type&&t.getEquipments().hashCode()==this.getEquipments().hashCode()){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.area,this.type,this.getEquipments());
    }
    @Override
    public String toString(){
        return "Имя ученого: "+this.name+"\nРод занятий: "+this.area+"\nВера в теорию: "+this.getTheorist()+"\nСписок оборудования: "+this.getEquipments();
    }
    public Object Writing(String name,int size,String Janr){
        class Book{
            private String name;
            private int size;
            private String Janr;
            Book(String name,int size,String Janr){
                this.name=name;
                this.size=size;
                this.Janr=Janr;
            }
        }
        Book book=new Book(name,size,Janr);
        return book;
    }
}
