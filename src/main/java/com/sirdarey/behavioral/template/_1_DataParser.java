package com.sirdarey.behavioral.template;

abstract class _1_DataParser {

    // The Template Method: Final so it cannot be overridden
    public final void parseDataAndLog() {
        openFile();
        parse();
        closeFile();
    }

    private void openFile() {
        System.out.println("Opening file...");
    }

    private void closeFile() {
        System.out.println("Closing file...");
    }

    // Abstract step: Subclasses must implement this
    protected abstract void parse();
}