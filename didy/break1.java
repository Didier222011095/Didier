class Break {
    public static void main(String[] args) {
        // Experiment: Using break in a for loop
        
        System.out.println("Experiment 1: Using break in a for loop");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            
            // Break the loop when i is greater than 5
            if (i > 5) {
                System.out.println("\nBreaking the loop at i = " + i);
                break;
            }
        }
        
        System.out.println("End of program");
    }
}