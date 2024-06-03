/** Nama : Tera Makna Pratiwi
 *  NIM  : 24060122140102
 */

public abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " adalah kendaraan yang hebat.";
    }
}