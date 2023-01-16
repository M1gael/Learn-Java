import java.util.concurrent.TimeUnit;

public class AsciiDonut {

    public static final int SIZE = 20;
    public static final double ROTATION_SPEED = 0.05;

    public static void main(String[] args) {
        double angle = 0;
        while (true) {
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
            angle += ROTATION_SPEED;
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
