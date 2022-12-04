abstract class CelestialBodies implements gsName, gsSize {
    protected double DistanceToEarth;
    protected String name;
    protected double size;
    CelestialBodies(String name,double size,double DistanceToEarth){
        this.DistanceToEarth=DistanceToEarth;
        this.name=name;
        this.size=size;
    }
}
