package com.sf.gandalf.designpatterns.creational.singleton;

public class Singleton {
    static void main() {
//        DatabaseConnection connection1 = DatabaseConnection.getInstance();
//        DatabaseConnection connection2 = DatabaseConnection.getInstance();
//        System.out.println( connection1 == connection2 );

        Runnable task = () -> {
            DatabaseConnection connection3 = DatabaseConnection.getInstance();
            System.out.println(connection3);
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

    }
}

class DatabaseConnection {
    private static volatile DatabaseConnection instance; // volatile tells JVM that, this variable may be accessed by multiple threads — always read it from main memory, not from a thread’s local cache.

    // Double-Checked Locking (Best Practice)
    public  static DatabaseConnection getInstance() {
        if(null == instance) { // 1. Check with no-locking
            synchronized (DatabaseConnection.class) {
                if(null == instance) { // 2. Check with locking
                    System.out.println("Creating new Instance of DatabaseConnection");
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}