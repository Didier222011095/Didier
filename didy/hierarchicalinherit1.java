class hierarchicalinherit1 {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        Circle myCircle = new Circle();
        Rectangle myRectangle = new Rectangle();

        // Calling the overridden draw method from the derived classes
        myCircle.draw();
        myRectangle.draw();
    }
}
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Derived class 2
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

