package com.sirdarey.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// 3. Subject
class _3_YouTubeChannel {

    private final List<_1_Subscriber> subscribers = new ArrayList<>();

    public void subscribe(_1_Subscriber s) {
        subscribers.add(s);
    }

    public void uploadVideo(String title) {
        System.out.println("Uploading: " + title);

        for (_1_Subscriber s : subscribers) {
            s.update(title);
        }
    }
}