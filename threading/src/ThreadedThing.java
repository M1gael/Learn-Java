public class ThreadedThing implements Runnable{ // Right here

    private int threadNumber;

    public ThreadedThing(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i = 1 ; i<=5 ; i++){
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){}
        }
    }
}