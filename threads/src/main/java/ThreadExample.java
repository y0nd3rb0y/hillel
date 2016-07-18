public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        //myThread.setPriority(Thread.MIN_PRIORITY);
        myThread.join();

        MyThread myOtherThread = new MyThread();
        myOtherThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
