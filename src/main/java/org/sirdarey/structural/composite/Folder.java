package org.sirdarey.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) { this.name = name; }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent child : children) {
            child.showDetails(); // Recursive call handles the tree traversal
        }
    }
}