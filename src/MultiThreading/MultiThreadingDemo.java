package MultiThreading;

public class MultiThreadingDemo {

    public static void main(String[] args) {

        ImplementingRunnable ir = new ImplementingRunnable();
        Thread t = new Thread(ir);
        t.start();

        for(int i=1; i<=10; i++)
            System.out.println("Coding School");
    }
}
