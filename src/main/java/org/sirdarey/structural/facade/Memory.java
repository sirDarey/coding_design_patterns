package org.sirdarey.structural.facade;

class Memory {

    void load(long position, byte[] data) {
        System.out.println("Memory Load; position-> " + position + " data size-> " + data.length);
    }
}