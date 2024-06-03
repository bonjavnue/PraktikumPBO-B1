/** Nama : Tera Makna Pratiwi
 *  NIM  : 24060122140102
 */

public abstract class Animal {
    public abstract void eat();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}