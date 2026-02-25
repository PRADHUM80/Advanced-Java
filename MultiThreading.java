import java.util.Scanner;

class PrintNum implements Runnable{
    @Override
    public void run() {
        System.out.println("Print Num Activity Started");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Kodnest");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Print Num Activity Completed");
    }
}

class Addition implements Runnable {
    @Override
    public void run() {
        System.out.println("Addition Activity Started");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();

        int res = a + b;
        System.out.println("Result is: " + res);

        System.out.println("Addition Activity Completed");
    }
}

class PrintChar implements Runnable{
    @Override
    public void run() {
        System.out.println("Print Char Activity Started");
        for (char ch = 'A'; ch <= 'I'; ch++) {
            System.out.println(ch);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Print Char Activity Completed");
    }
}

public class MultiThreading{
    public static void main(String[] args) {

        PrintNum p = new PrintNum();
        Addition a = new Addition();
        PrintChar c = new PrintChar();

       Thread t1 = new Thread(p) ;
       Thread t2 = new Thread(a) ;
       Thread t3 = new Thread(c) ;

       t1.start();
       t2.start();
       t3.start();

       try {
           t1.join();
           t2.join();
           t3.join();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       System.out.println("Main thread execution completed and file closed");
    }
}