package org.sirdarey.structural.facade;

class HardDrive {

    byte[] read(long lba, int size) {
        System.out.println("HardDrive Read :: lba-> " + lba + " size-> " + size);
        return new byte[]{};
    }
}