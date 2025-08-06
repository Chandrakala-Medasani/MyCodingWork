package MultiThreading;

public class MyThread {

    public static void main(String[] args) throws InterruptedException {

       ExtendingThreadClass etc = new ExtendingThreadClass();
       etc.start();

      // etc.join();

        for(int i=1; i<=10; i++)
            System.out.println("Helloooo!!!"+Thread.currentThread().getName());

    //  ExtendingThreadClass etc = new ExtendingThreadClass();
     //  etc.start();
    }
}

