package Models;

public class Mammals {
    public int  noOfChamber = 4;
    public boolean hairyBody = true;
    public String species;
    public int walksOn;

    public Mammals(int  walksOn, String species) {
        this.walksOn = walksOn;
        this.species = species;
    }
}
