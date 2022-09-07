package thread;

import java.util.Scanner;

public class Alarm {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1. Stop Alarm");
        System.out.println("2. Snooze Alarm");
        System.out.println("Enter your choice");

        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
            if (input == 1) {
                System.out.println("Alarm stopped..");
            } else {
                System.out.println("Alarm snoozed for 5 sec");
                Thread.sleep(5000);
                System.out.println("Beep.....");
            }
    }
}
