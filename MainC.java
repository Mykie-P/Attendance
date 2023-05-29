public class MainC {
    public static void main(String[] args) {
    	System.out.println("Car");
    	ToyotaVios toyotaVios = new ToyotaVios(120, "Black", 700000.0, "Summer Tires");
        toyotaVios.displayInfo();
        toyotaVios.drive();
        toyotaVios.stop();
        
    	System.out.println("\nPlane");
        U2SpyPlane u2SpyPlane = new U2SpyPlane(500, "Gold", 10000000.0, 80.5);
        u2SpyPlane.displayInfo();
        u2SpyPlane.fly();
        u2SpyPlane.stop();
        
    	System.out.println("\nBoat");
        FandangoYacht fandangoYacht = new FandangoYacht(30, "White", 5000000.0, "White");
        fandangoYacht.displayInfo();
        fandangoYacht.floatBoat();
        fandangoYacht.stop();
    }
}