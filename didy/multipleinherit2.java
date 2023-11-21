class multipleinherit2 {
    public static void main(String[] args) {
       
        ClimbingDiggingAnimal animal = new ClimbingDiggingAnimal();
        animal.performClimbing();
        animal.performDigging();
    }
}

class Climbing {
    void climb() {
        System.out.println("Climbing a tree");
    }
}

class Digging {
    void dig() {
        System.out.println("Digging a hole");
    }
}


class ClimbingDiggingAnimal {
    private Climbing climbingAbility;
    private Digging diggingAbility;

    public ClimbingDiggingAnimal() {
        this.climbingAbility = new Climbing();
        this.diggingAbility = new Digging();
    }

    public void performClimbing() {
        climbingAbility.climb();
    }

    public void performDigging() {
        diggingAbility.dig();
    }
}

