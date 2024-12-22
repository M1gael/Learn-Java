public class threadedThing extends Thread{

    private int threadNumber;

    public threadedThing(int threadNumber){
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
