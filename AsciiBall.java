public class AsciiBall {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        for (int z = -SIZE; z <= SIZE; z++) {
            for (int y = -SIZE; y <= SIZE; y++) {
                for (int x = -SIZE; x <= SIZE; x++) {
                    double distance = Math.sqrt(x * x + y * y + z * z);
                    if (distance > SIZE - 0.5 && distance < SIZE + 0.5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
