class Continue11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // Skip odd numbers
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}