package com.sirdarey.creational.singleton;


class SingletonUsage {

    /**
     * The Singleton Pattern ensures a class has only one instance and provides a global point of access to it.
     * This is particularly useful for managing shared resources like database connections, configuration settings, or logging
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Singleton Pattern Demo -----\n");

        DatabaseManager db1 = DatabaseManager.getInstance();
        DatabaseManager db2 = DatabaseManager.getInstance();

        db1.query("SELECT * FROM users");

        // Output: true (Same instance)
        System.out.println("Are instances equal? " + (db1==db2));

        System.out.println("\n----- Ending Singleton Pattern Demo -----\n");
    }
}