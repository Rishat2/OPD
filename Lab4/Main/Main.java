package Main;
import Main.Car.Cars.AircraftHydromotor;
import L.Calc;
import Main.Car.Cars.SpiralWalker;
import Main.CelestialBodies.Planets.City;
import Main.CelestialBodies.Planets.House;
import Main.CelestialBodies.Planets.Planets;
import Main.CelestialBodies.Sattelites.Satellites;
import Main.Equipment.Science.Telescope;
import Main.Exception.CreateException;
import Main.Person.Persons.Scientist.Science;
import Main.Person.Persons.Scientist.Scientist;
import Main.Person.Persons.Scientist.Theorist;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws CreateException {
        try {
            SpiralWalker.createSpiralWalker(12, 2);
        } catch (CreateException e) {
            System.err.println(e.getMessage());
        }
        try {
            SpiralWalker.createSpiralWalker(12, 2);
        } catch (CreateException e) {
            System.err.println(e.getMessage());
        }
        AircraftHydromotor aircraftHydromotor = null;
        try {
            aircraftHydromotor = AircraftHydromotor.createAircraftHydromotor(12, 2, "intel");
        } catch (CreateException e) {
            System.err.println(e.getMessage());
        }
        Scientist scientist1 = new Scientist("Knowitall", Science.GENERAL);
        Scientist scientist2 = new Scientist("Knowital", Science.GENERAL);
        System.out.println(scientist1.setTheory(scientist1, Theorist.METEORITE));
        System.out.println(scientist1.getTheorist());
        City town1 = new City("SOLAR", 50, 30);
        House house = new House("KUV", 7);
        house.addPerson(scientist1);
        System.out.println(house.getPerson());
        System.out.println(house.pollPerson(scientist2));
        System.out.println(house.pollPerson(scientist1));
        System.out.println(house.getPerson());
        //AircraftHydromotor aircraftHydromotor=new AircraftHydromotor(234,2,"Intel");
        AircraftHydromotor.CalcHeight calc = AircraftHydromotor.calculate(aircraftHydromotor.getEngine());
        System.out.println(calc.toString());
        House fabrica = new House("Street 45", 500) {
            public Object does(String name, double size, Type type) {
                class Thing {
                    private String name;
                    private double size;
                    private Type type;

                    Thing(String name, double size, Type type) {
                        this.name = name;
                        this.type = type;
                        this.size = size;
                    }

                    public String getType() {
                        return String.valueOf(type);
                    }

                    public String getName() {
                        return name;
                    }
                }

                Thing thing = new Thing(name, size, type);
                return thing;
            }
        };
        City city1 = new City("FLORAL", 40, 20);
        Planets planet1 = new Planets("Earth", 6400000, 0);
        Planets planet2 = new Planets("Earth", 6400000, 0);
        Satellites satellite1 = new Satellites("Moon", 3475, 384000, 1600);
        Satellites satellite2 = new Satellites("Moon", 3475, 384000, 1600);
        Telescope telescope1 = new Telescope("Hubble", 4, 3);
        scientist2.addEquipment(telescope1);
        Telescope telescope2 = new Telescope("Hubble", 4, 3);
        scientist1.addEquipment(telescope2);
        System.out.println(telescope2.equals(telescope1));
        System.out.println(telescope2.hashCode() + " " + telescope1.hashCode());
        System.out.println(telescope1.toString());
        System.out.println(telescope1.setOpticalPower(3));
        System.out.println(scientist1.addEquipment(telescope1));
        System.out.println(scientist2.hashCode() + " " + scientist1.hashCode());
        System.out.println(scientist2.equals(scientist1));
        scientist1.WatchTheSatellites(telescope1, satellite1, 1);
        System.out.println(scientist1.getPlanet());
        System.out.println(scientist1.toString());
        System.out.println(satellite1.equals(satellite2));
        System.out.println(satellite1.equals(satellite1));
        System.out.println(satellite2.hashCode() + " " + satellite1.hashCode());
        System.out.println(satellite1.hashCode() + " " + satellite1.hashCode());
        System.out.println(satellite1.toString());
        System.out.println(planet2.hashCode() + " " + planet1.hashCode());
        System.out.println(planet1.hashCode() + " " + planet1.hashCode());
        System.out.println(planet1.toString());
        System.out.println(planet1.equals(planet2));
        System.out.println(planet1.equals(planet1));
        System.out.println();
        Operationable operation;
        operation = (x, y) -> x + y;

        int result = operation.calculate(10, 20);
        System.out.println(result); //30
        Operationable op;
        op = Calc::Calculator;
        System.out.println(op.calculate(1, 2));


        LinkedList<String> person = new LinkedList<>();
        person.add("Петя");
        person.add("Вася");
        person.addFirst("Иван");
        person.addLast("Маша");
        System.out.println(person.getFirst());
    }


@FunctionalInterface
public interface Operationable{
    int calculate(int x, int y);
}
    }


