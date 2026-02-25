import java.util.Scanner;
public class MyThread {
    public static void main(String[] args) {
        Thread t  = Thread.currentThread();
        System.out.println(t);

        t.setName("Pradhum");
        System.out.println(t);

        t.setPriority(7);
        System.out.println(t);

        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t);

        t.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t);

        System.out.println(t.getName());
        
        System.out.println(t.getPriority());

        System.out.println(t.getClass());
    }
}
