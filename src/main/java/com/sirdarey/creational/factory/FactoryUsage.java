package com.sirdarey.creational.factory;


class FactoryUsage {

    /**
     * The Factory Method Pattern defines an interface for creating an object,
     * but lets subclasses alter the type of objects that will be created.
     * This pattern is particularly useful when the exact type of the object
     * to be created isn't known until runtime or when the creation process is complex.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Factory Method Pattern Demo -----\n");

        // We can switch implementations without changing client code logic
        _3_NotificationFactory smsFactory = new _4_SMSFactory();
        smsFactory.sendNotification(); // Output: Sending SMS...

        _3_NotificationFactory emailFactory = new _4_EmailFactory();
        emailFactory.sendNotification(); // Output: Sending Email...

        System.out.println("\n----- Ending Factory Method Pattern Demo -----\n");
    }
}