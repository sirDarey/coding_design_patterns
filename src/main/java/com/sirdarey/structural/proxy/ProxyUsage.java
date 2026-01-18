package com.sirdarey.structural.proxy;

class ProxyUsage {

    /**
     * Proxy Pattern is a structural design pattern that provides an object that acts as a substitute
     * for a real service object used by a client.
     * A proxy receives client requests, does some work (access control, caching, etc.), and then passes the request to a service object.
     */
    public static void main(String[] args) {

        System.out.println("\n--- Proxy Pattern Example ---\n");

        Image image = new ProxyImage("test_10mb.jpg");

        // Image is NOT loaded from disk yet (saves memory)
        System.out.println("Image object created.");

        // Image loads now because we asked for it
        image.display();

        System.out.println("\n--- End of Proxy Pattern Example ---\n");
    }
}