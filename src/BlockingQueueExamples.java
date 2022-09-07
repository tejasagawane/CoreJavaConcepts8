import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueExamples {
    static BlockingQueue<Obj> bqueue = new LinkedBlockingDeque<Obj>(20);

    public static void main(String [] args) {

        Thread p1= new Thread(new Producer(bqueue));
        //Thread p2= new Thread(new Producer(bqueue));
        p1.start();
        //p2.start();

        Thread c1= new Thread(new Consumer(bqueue));
        //Thread c2= new Thread(new Consumer(bqueue));
        c1.start();
        //c2.start();

    }

}

 class Producer implements Runnable{
     BlockingQueue bq;
    Producer(BlockingQueue bq) {
        this.bq = bq;
    }
     @Override
     public void run() {

        for (int i=0; i < 5; i++) {
            Obj obj = new Obj(""+i);
            try {
                bq.put(obj);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Producer item"+i);
        }

     }
 }


class Consumer implements Runnable{
    BlockingQueue bq;
    Consumer(BlockingQueue bq) {
        this.bq = bq;
    }
    @Override
    public void run() {

        for (int i=0; i < 5; i++) {
            try {
                Obj obj = (Obj) bq.take();
                System.out.println("Consuming object:"+obj.name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class Obj {
    String name;
    Obj (String name) {
        this.name = name;
    }
}
