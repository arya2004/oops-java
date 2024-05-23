package org.labExam;

public class twenty_five {
    public static void main(String[] args) {
        // Sample Input: Total count of numbers and number of threads
        int totalCount = 100;
        int numThreads = 5;

        // Calculate the portion of numbers each thread will handle
        int numbersPerThread = totalCount / numThreads;

        // Create an array to hold thread objects
        Thread[] threads = new Thread[numThreads];

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            final int start = i * numbersPerThread + 1;
            final int end = (i + 1) * numbersPerThread;
            threads[i] = new Thread(() -> {
                for (int num = start; num <= end; num++) {
                    System.out.println(Thread.currentThread().getName() + ": " + num);
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
    }
}



