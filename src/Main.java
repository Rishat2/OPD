public class Main {
    public static void main(String[] args) {
        Scientist scientist1=new Scientist("Knowitall", Science.GENERAL);
        Scientist scientist2=new Scientist("Knowitall",Science.GENERAL);
        scientist1.Come(City.FLORAL);
        scientist1.Leave(City.SOLAR);
        scientist1.Leave(City.FLORAL);
        scientist1.Come(City.SOLAR);
        System.out.println(scientist1.setTheory(scientist1,Theorist.METEORITE));
        System.out.println(scientist1.getTheorist());
        Planets planet1=new Planets("Earth",6400000,0,7000000);
        Planets planet2=new Planets("Earth",6400000, 0,7000000);
        scientist1.SettleDown(planet1);
        Satellites satellite1=new Satellites("Moon",3475,384000,1600);
        Satellites satellite2=new Satellites("Moon",3475,384000,1600);
        Telescope telescope1=new Telescope("Hubble",4,3);
        scientist2.addEquipment(telescope1);
        Telescope telescope2=new Telescope("Hubble",4,3);
        scientist1.addEquipment(telescope2);
        System.out.println(telescope2.equals(telescope1));
        System.out.println(telescope2.hashCode()+" "+telescope1.hashCode());
        System.out.println(telescope1.toString());
        System.out.println(telescope1.setOpticalPower(3));
        System.out.println(scientist1.addEquipment(telescope1));
        System.out.println(scientist2.hashCode()+" "+scientist1.hashCode());
        System.out.println(scientist2.equals(scientist1));
        scientist1.WatchTheSatellites(telescope1,satellite1,1);
        System.out.println(scientist1.getPlanet());
        System.out.println(scientist1.toString());
        System.out.println(satellite1.equals(satellite2));
        System.out.println(satellite1.equals(satellite1));
        System.out.println(satellite2.hashCode()+" "+satellite1.hashCode());
        System.out.println(satellite1.hashCode()+" "+satellite1.hashCode());
        System.out.println(satellite1.toString());
        System.out.println(planet2.hashCode()+" "+planet1.hashCode());
        System.out.println(planet1.hashCode()+" "+planet1.hashCode());
        System.out.println(planet1.toString());
        System.out.println(planet1.equals(planet2));
        System.out.println(planet1.equals(planet1));
    }

}