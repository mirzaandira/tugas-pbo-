public class Looping {
    public static void main(String[] args) {
        // 1.
        for (int i = 0; i < 10; i++) {
            System.out.println("Saya semangat belajar java");
        }
        
        // 2. 
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("10");
        
        // 3.
        for (int i = 9; i >= -6; i -= 3) {
            System.out.print(i + " ");
        }
        
        // 4.
        for (int i = 6; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        
        // 5. 
        int n = 1;
        int increment = 2;
        for (int i = 0; i < 8; i++) {
            System.out.print(n + " ");
            n += increment;
            increment++;
        }
    }
}
