class hierarchicalinherit2 {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Calling methods from the base and derived classes
        myDog.eat();
        myDog.bark();

        myCat.eat();
        myCat.meow();
    }
}
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

