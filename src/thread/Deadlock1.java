package thread;

public class Deadlock1 {

    public static void main(String[] args) throws InterruptedException {
        Worker.t = Thread.currentThread();
        Thread t1 = new Thread(new Worker());
        t1.start();
        t1.join();
        System.out.println("Main thread..");
    }
}

class Worker implements Runnable {

    static Thread t;
    @Override
    public void run() {
        try {
            System.out.println("Worker Before sleep");
            t.join();
            //System.out.println("Worker After sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
