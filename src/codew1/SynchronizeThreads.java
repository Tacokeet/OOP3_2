package codew1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SynchronizeThreads {
    private int sum = new Integer(0);

    public static void main(String[] args) {
        SynchronizeThreads test = new SynchronizeThreads();
        System.out.println(test.sum);
    }

    public SynchronizeThreads() {
        ExecutorService executor = Executors.newFixedThreadPool(1000);
        for (int i = 0; i < 1000; i++) {
            Runnable worker = new WorkerThread();
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }


    class WorkerThread implements Runnable {

        public void run() {
            sum++;
        }

    }
}

//public class SynchronizeThreads {
//    private int sum = new Integer(0);
//
//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(1000);
//        for (int i = 0; i < 1000; i++) {
//            Runnable worker = new WorkerThread();
//            executor.execute(worker);
//        }
//        executor.shutdown();
//        while (!executor.isTerminated()) {
//        }
//        System.out.println("Finished all threads");
//        System.out.println(sum);
//    }
//
//
//
//    static class WorkerThread implements Runnable {
//
//        public void run() {
//            sum++;
//        }
//
//    }
//}
