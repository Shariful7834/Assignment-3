
public class VehicleManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create manufacture objects
        Manufacture toyota = new Manufacture("Toyota", "Japan");
        Manufacture tesla = new Manufacture("Tesla", "USA");
        Manufacture ford = new Manufacture("Ford", "USA");

        // Create engine objects
        CombustionEngine combustionEngine = new CombustionEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        HybridEngine hybridEngine = new HybridEngine();

        // Create vehicle objects
        Vehicle[] vehicles = new Vehicle[] {
            new ICEV(toyota, combustionEngine),
            new BEV(tesla, electricEngine),
            new HybridV(ford, hybridEngine)
        };

        // Display characteristics of each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println("-------------------------------");
        }
    }
}