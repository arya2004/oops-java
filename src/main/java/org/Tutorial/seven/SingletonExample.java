package org.Tutorial.seven;

public class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {
        // Private constructor to prevent instantiation outside this class
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();

        System.out.println(obj1 == obj2); // Output: true
    }
}
