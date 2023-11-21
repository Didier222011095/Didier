class Interface1 {
    public static void main(String[] args) {
        EnglishGreeting englishGreeting = new EnglishGreeting();

        englishGreeting.greet();
        englishGreeting.defaultGreet();
    }
}
interface Greeting {
    void greet();

    default void defaultGreet() {
        System.out.println("Default greeting");
    }
}

// Concrete class implementing the Greeting interface
class EnglishGreeting implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hello!");
    }
}

