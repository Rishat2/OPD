package Main.CelestialBodies.Planets;

import Main.CelestialBodies.CelestialBodies;

import java.util.ArrayList;
import java.util.Objects;

public final class Planets extends CelestialBodies {
    private int population;
    private int id = 0;
    private static int counter = 1;
    private ArrayList<Objects> city=new ArrayList<>(10);

    public Planets(String name, double size, double DistanceToEarth) {
        super(name, size, DistanceToEarth);
        id = counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDistance(double DistanceToEarth) {
        this.DistanceToEarth = DistanceToEarth;
    }

    public double getDistance() {
        return DistanceToEarth;
    }

    public void setSize(double size) {

        if (size < 0) {
            System.out.println("Размер не может быть отрицательным");
        } else {
            this.size = size;
        }
    }

    public double getSize() {
        return size;
    }

    public void setPopulation(int population) {

        if (population < 0) {
            System.out.println("Популяция не может быть отрицательной");
        } else {
            this.population = population;
        }
    }

    public int getPopulation() {
        return population;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Planets t = (Planets) obj;
        if (t.id == this.id) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    public String toString() {
        return "Название планеты: " + this.name + "\nРазмер: " + this.size + "м\nНаселение: " + this.population;
    }
}


