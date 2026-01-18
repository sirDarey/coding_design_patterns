package com.sirdarey.creational.factory;

//4. Concrete Creators
class _4_SMSFactory extends _3_NotificationFactory {

    @Override
    public _1_Notification createNotification() {
        return new _2_SMSNotification();
    }
}