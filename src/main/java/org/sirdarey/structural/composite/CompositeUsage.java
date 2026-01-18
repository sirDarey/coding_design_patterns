package org.sirdarey.structural.composite;

class CompositeUsage {

    /**
     * Composite Pattern is used to treat individual objects and compositions of objects uniformly.
     * In this example, both File and Folder implement the FileSystemComponent interface,
     * allowing us to treat files and folders in the same way.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Composite Pattern Demo -----\n");

        File file1 = new File("Document.txt");
        File file2 = new File("Image.png");

        Folder subFolder = new Folder("My Stuff");
        subFolder.add(file1);
        subFolder.add(file2);

        Folder root = new Folder("Root");
        root.add(subFolder);

        // Treats the whole tree uniformly
        root.showDetails();

        System.out.println("\n-----Ending Composite Pattern Demo -----\n");
    }
}