package com.sirdarey.structural.proxy;

class ProxyImage implements Image {

    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Lazy Initialization: Only load the heavy object when requested
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}