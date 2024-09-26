abstract class Vehicle {
    Manufacture manufacture;
    Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    // Abstract method to be implemented by subclasses
    public abstract void ShowCharacteristics();
}
