package com.sirdarey.behavioral.observer;

// 2. Concrete Observers
class _2_EmailSubscriber implements _1_Subscriber {

    private final String name;

    public _2_EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title) {
        System.out.println(name + ": Received email for " + title);
    }
}