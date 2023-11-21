class singleinherit11 {
    public static void main(String[] args) {
        // Creating an object of the derived class
        Circle myCircle = new Circle();

        // Calling the overridden method from the derived class
        myCircle.draw();
    }
}
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class inheriting from Shape and overriding the draw method
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Main class to demonstrate single inheritance with method overriding
