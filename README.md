# Vehicle Management Program

# **Matriculation Number:** 7213424

## Project Description

This project implements a Java program that manages different types of vehicles, including internal combustion engine vehicles (ICEV), battery electric vehicles (BEV), and hybrid vehicles (HybridV). The program demonstrates object-oriented principles such as inheritance, abstract methods, and class hierarchies.

### Class Hierarchy:
1. **Engine Class**:
   - Base class for different types of engines (`CombustionEngine`, `ElectricEngine`, `HybridEngine`).
2. **Manufacture Class**:
   - Stores information about the manufacturer (name, country).
3. **Vehicle Class**:
   - Abstract class representing a vehicle with an abstract method `ShowCharacteristics()`.
   - Subclasses:
     - `ICEV` (Internal Combustion Engine Vehicle)
     - `BEV` (Battery Electric Vehicle)
     - `HybridV` (Hybrid Vehicle)
4. **Main Class (`VehicleManager`)**:
   - Creates and manages an array of `Vehicle` objects and displays their characteristics.

## Development Environment

- **Java Version:** OpenJDK 11
- **IDE:** IntelliJ IDEA 2023.1 / Eclipse / Visual Studio Code
- **Operating System:** Windows 10 / Linux Ubuntu 20.04

## How to Run the Program

1. Clone the repository from GitHub.
2. Compile and run the `VehicleManager.java` file.
3. The characteristics of each vehicle (ICEV, BEV, HybridV) will be displayed in the console.

## Files

- `Engine.java`: Base class for different engine types.
- `Manufacture.java`: Class for the manufacturer details.
- `Vehicle.java`: Superclass with subclasses `ICEV`, `BEV`, `HybridV`.
- `VehicleManager.java`: Main class to demonstrate vehicle characteristics.
- `README.md`: This file containing the project description.
