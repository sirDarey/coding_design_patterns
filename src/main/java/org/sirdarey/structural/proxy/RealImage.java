package org.sirdarey.structural.proxy;


class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName); // Expensive operation happens here
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName + " from disk...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}