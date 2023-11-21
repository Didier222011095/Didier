class Continue22 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Skip vowels
            if ("aeiouAEIOU".indexOf(currentChar) != -1) {
                continue;
            }

            System.out.print(currentChar);
        }
    }
}