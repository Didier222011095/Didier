class MultipleInheritanceWithoutInterface {
    public static void main(String[] args) {
       
        FlyingFish flyingFish = new FlyingFish();

        flyingFish.performFlying();
        flyingFish.performSwimming();
    }
}
class Flying {
    void fly() {
        System.out.println("Flying in the sky");
    }
}

class Swimming {
    void swim() {
        System.out.println("Swimming in the water");
    }
}

class FlyingFish {
    private Flying flyingAbility;
    private Swimming swimmingAbility;

    public FlyingFish() {
        this.flyingAbility = new Flying();
        this.swimmingAbility = new Swimming();
    }

    public void performFlying() {
        flyingAbility.fly();
    }

    public void performSwimming() {
        swimmingAbility.swim();
    }
}

