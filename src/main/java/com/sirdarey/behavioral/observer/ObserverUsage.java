package com.sirdarey.behavioral.observer;

class ObserverUsage {

    /**
     * The Observer Pattern defines a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
     * This is ideal for event-driven systems like UI listeners, stock market updates, or social media notifications.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Observer Pattern Demo -----\n");

        _3_YouTubeChannel channel = new _3_YouTubeChannel();

        _1_Subscriber sub1 = new _2_EmailSubscriber("Alice");
        _1_Subscriber sub2 = new _2_EmailSubscriber("Bob");

        channel.subscribe(sub1);
        channel.subscribe(sub2);

        // Triggers notification to all subscribers
        channel.uploadVideo("Design Patterns in Java");

        System.out.println("\n----- Ending Observer Pattern Demo -----\n");
    }
}