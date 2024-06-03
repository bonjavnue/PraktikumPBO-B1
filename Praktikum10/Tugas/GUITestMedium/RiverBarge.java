/** Nama : Tera Makna Pratiwi
 *  NIM  : 24060122140102
 */

public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge() {
        this.maxLoad = 20000;
    }

    @Override
    public double calcFuelEfficiency() {
        return maxLoad / 15; 
    }

    @Override
    public double calcTripDistance() {
        return maxLoad / 7; 
    }

    @Override
    public String toString() {
        return "RiverBarge adalah angkutan sungai yang kuat";
    }
}
