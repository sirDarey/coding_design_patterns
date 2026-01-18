package org.sirdarey.creational.singleton;


public class DatabaseManager {

    //Volatile ensures changes are immediately visible to other threads
    private static volatile DatabaseManager instance;

    //Private constructor prevents instantiation from outside
    private DatabaseManager() {
        System.out.println("Initializing Database Connection...");
    }

    //Public static method to get the instance
    public static DatabaseManager getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (DatabaseManager.class) {
                if (instance == null) { // Second check (locking)
                    instance = new DatabaseManager();
                }
            }
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }
}