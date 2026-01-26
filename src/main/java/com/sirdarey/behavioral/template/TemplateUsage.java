package com.sirdarey.behavioral.template;

class TemplateUsage {

    /**
     * The Template Method Pattern defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps.
     * It is used to enforce a specific workflow (e.g., Open -> Process -> Close) while allowing variations in the details.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Template Method Pattern Demo -----\n");

        System.out.println("--- Processing CSV ---");
        _1_DataParser csvParser = new _2_CSVParser();
        csvParser.parseDataAndLog(); // Runs the fixed workflow

        System.out.println("\n--- Processing JSON ---");
        _1_DataParser jsonParser = new _2_JSONParser();
        jsonParser.parseDataAndLog(); // Runs the same workflow with different parsing logic

        System.out.println("\n----- Ending Template Method Pattern Demo -----\n");
    }
}