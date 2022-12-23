package Main.CelestialBodies.Planets;
import Main.Person.Person;
import java.util.ArrayList;
public class House{
    private String adress;
    Kitchen kitchen;
    BedRoom bedRoom;
    private int size;
    private int tenants=0;
    private int capacity=0;
    private ArrayList<Object> person=new ArrayList<>(10);
    public House(String adress, int capacity){
        this.adress=adress;
        this.capacity=capacity;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public ArrayList<Object> getPerson(){
        return person;
    }
    public int getTenants(){return tenants;}
    public void addPerson(Person p){
        if(this.capacity>tenants){
            p.settle(this.adress);
            person.add(p);
            tenants+=1;
            System.out.println("Человек успешно заселен");
        }
        else{
            System.out.println("Дом полностью занят заселиться нельзя!");
        }
    }
    public String pollPerson(Person p){
        for(int i=0;i<person.size();i++) {
            if (p.equals(person.get(i))) {
                p.Notsettle();
                person.remove(p);
                tenants--;
                return "Человек успешно выселен";
            }
        }
        return "Этот человек здесь не живет";
    }
    public String getAdress(){
        return this.adress;
    }
    class Kitchen{
        private double square;
        Kitchen(double square){
            this.square=square;
        }
        public double getSquare(){
            return square;
        }
    }

    class BedRoom{
        private double square;
        private int beds;
        BedRoom(double square,int beds){
            this.beds=beds;
            this.square=square;
        }
        public double getSquare(){
            return square;
        }
        public int getBeds(){
            return beds;
        }
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        House t=(House) obj;
        if(t.tenants==this.tenants&&this.adress==t.adress&&t.capacity==this.capacity){
            return true;
        }
        return false;
    }
}

