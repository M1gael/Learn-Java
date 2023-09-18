import java.util.Random;

public class Random {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate and print random integers
        System.out.println("Random Integers:");
        for (int i = 0; i < 5; i++) {
            int randomInt = random.nextInt(100); // Generates integers between 0 (inclusive) and 100 (exclusive)
            System.out.println(randomInt);
        }

        // Generate and print random doubles
        System.out.println("\nRandom Doubles:");
        for (int i = 0; i < 5; i++) {
            double randomDouble = random.nextDouble(); // Generates doubles between 0 (inclusive) and 1 (exclusive)
            System.out.println(randomDouble);
        }

        // Generate and print random booleans
        System.out.println("\nRandom Booleans:");
        for (int i = 0; i < 5; i++) {
            boolean randomBoolean = random.nextBoolean(); // Generates true or false randomly
            System.out.println(randomBoolean);
        }
    }
}
