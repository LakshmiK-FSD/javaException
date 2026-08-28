class InterfMul implements Runnable {
    private boolean typ = false;

    public synchronized void meth() {
        while (!typ) {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting...");
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName() + " resumed after notify");
    }


    public void run() {
        meth();
        System.out.println("Final typ value: " + typ);
    }
    public synchronized void changeState() {
        typ = true;
        notifyAll(); 
    }
}

public class BrainMult {
    public static void main(String[] args) throws InterruptedException {
        InterfMul task1 = new InterfMul();
        Thread T1 = new Thread(task1, "Thread-1");
        Thread T2 = new Thread(task1, "Thread-2");
        T1.start();
        T2.start();
        Thread.sleep(2000); 
        System.out.println("Main thread notifying...");
        task1.changeState();
     }
    }