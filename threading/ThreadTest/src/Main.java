public class Main {

    public static void main(String[] args) {

        for (int i = 1 ; i <=5 ; i++){
            threadedThing myThread = new threadedThing(i);
            myThread.start();
        }
    }
}