
class Printer implements Runnable 
{
    @Override
// synchronized key is used to make sure that only one thread can access the runnable code at a time.
    synchronized public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "Started using Printer");
            Thread.sleep(3000);
            System.out.println(threadName + "is using Printer");
            Thread.sleep(3000);
            System.out.println(threadName + "Stopped using Printer");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}



public class Synchronization {
    public static void main(String[] args) {
        Printer p = new Printer();

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(p);

        t1.setName("JavaDeveloper");
        t2.setName("PythonDeveloper");
        t3.setName("C++Developer");

        t1.start();
        t2.start();
        t3.start();

    }
}
