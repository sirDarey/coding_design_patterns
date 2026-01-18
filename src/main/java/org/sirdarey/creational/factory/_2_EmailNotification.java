package org.sirdarey.creational.factory;

//2. Concrete Products
class _2_EmailNotification implements _1_Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Email...");
    }
}