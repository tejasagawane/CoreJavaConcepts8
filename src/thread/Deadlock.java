package thread;

public class Deadlock {

    Resource r1 = new Resource();
    Resource r2 = new Resource();

    public void method1() {
        synchronized (r2){
            System.out.println("R2 Aquired lock by :"+Thread.currentThread());
            synchronized (r1){
                System.out.println("R1 Aquired lock by :"+Thread.currentThread());
            }
        }
    }

    public void method2() {
        synchronized (r2){
            System.out.println("R1 Aquired lock by :"+Thread.currentThread());
            synchronized (r1){
                System.out.println("R2 Aquired lock by :"+Thread.currentThread());
            }
        }
    }

    public static void main(String[] args) {
        /*Deadlock d = new Deadlock();

        Thread t1 = new Thread(new T1(d));
        Thread t2 = new Thread(new T2(d));
        t1.start();
        t2.start();*/
        System.out.println(Runtime.getRuntime().availableProcessors());

    }

}

class Resource {}

class T1 implements Runnable {

    Deadlock d;
    T1(Deadlock d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.method1();
    }
}


class T2 implements Runnable {

    Deadlock d;
    T2(Deadlock d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.method2();
    }
}