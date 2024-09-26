class ICEV extends Vehicle {

    public ICEV(Manufacture manufacture, CombustionEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: ICEV");
        System.out.println(manufacture);
        System.out.println("Engine Type: " + engine.getType());
    }
}

class BEV extends Vehicle {

    public BEV(Manufacture manufacture, ElectricEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: BEV (Battery Electric Vehicle)");
        System.out.println(manufacture);
        System.out.println("Engine Type: " + engine.getType());
    }
}

class HybridV extends Vehicle {

    public HybridV(Manufacture manufacture, HybridEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: HybridV");
        System.out.println(manufacture);
        System.out.println("Engine Type: " + engine.getType());
    }
}
