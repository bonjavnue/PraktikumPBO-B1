/** Nama : Tera Makna Pratiwi
 *  NIM  : 24060122140102
 */

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Permission granted to land.";
        } else {
            return "Permission denied. Only airplanes are allowed to land.";
        }
    }
}