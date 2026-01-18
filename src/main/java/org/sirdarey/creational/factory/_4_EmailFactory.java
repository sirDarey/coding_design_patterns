package org.sirdarey.creational.factory;

//4. Concrete Creators
class _4_EmailFactory extends _3_NotificationFactory {

    @Override
    public _1_Notification createNotification() {
        return new _2_EmailNotification();
    }
}