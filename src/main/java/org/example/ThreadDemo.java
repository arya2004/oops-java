package org.example;

public class ThreadDemo {

    // Define a custom thread by extending the Thread class
    static class MyThread extends Thread {
        public void run() {
            // Define the task that this thread will execute
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread running: " + i);
                try {
                    // Introduce a delay to simulate some work
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of our custom thread
        MyThread myThread = new MyThread();

        // Start the thread
        myThread.start();

        // Demonstrate that the main thread can also do work concurrently
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread running: " + i);
            try {
                // Introduce a delay to simulate some work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
