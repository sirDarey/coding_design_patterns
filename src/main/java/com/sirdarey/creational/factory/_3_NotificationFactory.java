package com.sirdarey.creational.factory;

//3. The Creator (Factory)
abstract class _3_NotificationFactory {

    // This is the Factory Method
    public abstract _1_Notification createNotification();

    // Core business logic uses the product, but doesn't know concrete class
    public void sendNotification() {
        _1_Notification notification = createNotification();
        notification.notifyUser();
    }
}