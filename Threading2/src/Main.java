public class Main {

    public static void main(String[] args) {

        for (int i = 1 ; i <=5 ; i++){
            ThreadedThing myThing = new ThreadedThing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
        }
    }
}