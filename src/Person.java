abstract class Person implements gsName {
    protected String name;
    private String planet;
    private String place;
    {
        name="nobody";
        place="nowhere";
    }
    Person(String name) {
        this.name = name;
    }
    protected void SettleDown(Object planet){
        Planets p=(Planets) planet;
        this.planet=p.getName();
    }
    protected void Come(City city){
        place= String.valueOf(city);
        System.out.println("Персонаж прибыл в город "+place);
    }
    protected String getPlace(){
        return place;
    }
    protected String getPlanet(){
        return planet;
    }
    protected void Leave(City city){
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
