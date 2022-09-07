package thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }

}

class Producer extends Thread{
    Queue<Integer> q;
    Producer(Queue q) {
        this.q = q;
    }

    public void run(){
        while(true) {
            synchronized (q) {
                while (q.size() == 3) {
                    try {
                        q.wait();
                        System.out.println("Producer is full and waiting for consumer...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Random r = new Random();
                Integer i = r.nextInt();
                q.add(i);
                System.out.println("Producer has added :" + i);
                q.notify();
            }
        }
    }

}

class Consumer extends Thread{

    Queue q;
    Consumer(Queue q){
        this.q = q;
    }

    public void run(){
        while(true) {
            synchronized (q) {

                while(q.isEmpty()) {
                    try {
                        q.wait();
                        System.out.println("Consumer queue is empty");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumed from queue :"+q.remove());
                q.notify();
            }
        }
    }
}


