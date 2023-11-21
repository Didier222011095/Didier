class singleinherit22 {
    public static void main(String[] args) {
        // Creating an object of the derived class
        Car myCar = new Car("Toyota", 4);

        // Calling the overridden method from the derived class
        myCar.displayInfo();
    }
}
class Vehicle {
    String brand;

    // Parameterized constructor in the base class
    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Derived class inheriting from Vehicle
class Car extends Vehicle {
    int numberOfDoors;

    // Parameterized constructor in the derived class
    Car(String brand, int numberOfDoors) {
        super(brand); // Call to the parameterized constructor of the base class
        this.numberOfDoors = numberOfDoors;
    }

    // Overriding the displayInfo method to include additional information
    @Override
    void displayInfo() {
        super.displayInfo(); // Call to the displayInfo method of the base class
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

// Main class to demonstrate single inheritance with parameterized constructors
