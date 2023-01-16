import java.util.concurrent.TimeUnit;

public class AsciiCylinder {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        double angle = 0;
        while (true) {
            for (int z = -SIZE; z <= SIZE; z++) {
                for (int y = -SIZE; y <= SIZE; y++) {
                    for (int x = -SIZE; x <= SIZE; x++) {
                        double xr = x * Math.cos(angle) - y * Math.sin(angle);
                        double yr = x * Math.sin(angle) + y * Math.cos(angle);
                        double distance = Math.sqrt(xr * xr + yr * yr);
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
            angle += Math.PI / 180;
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
