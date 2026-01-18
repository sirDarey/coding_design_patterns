package com.sirdarey.creational.abstract_factory;

import com.sirdarey.creational.abstract_factory._1_ProductInterface.Button;
import com.sirdarey.creational.abstract_factory._1_ProductInterface.Checkbox;
import com.sirdarey.creational.abstract_factory._3_GUIFactory.GUIFactory;
import com.sirdarey.creational.abstract_factory._4_ConcreteFactories.MacFactory;
import com.sirdarey.creational.abstract_factory._4_ConcreteFactories.WindowsFactory;

public class AbstractFactoryUsage {

    /**
     * The Abstract Factory Pattern is a creational design pattern that provides an interface
     * for creating families of related or dependent objects without specifying their concrete classes.
     * It is useful when the system needs to be independent of how its objects are created, composed, and represented
     * and when the system needs to be configured with one of multiple families of products.

     * In this example, we have two families of products: Mac and Windows. Each family has its own implementations of Button and Checkbox.
     * The GUIFactory interface defines methods for creating these products, and the concrete factories (MacFactory and WindowsFactory)
     * implement these methods to create the appropriate products for each family.

     * The client code (in the main method) uses the GUIFactory to create buttons and checkboxes without needing to know which specific factory it is using.
     * This allows for easy switching between different product families by simply changing the factory being used.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Abstract Factory Method Pattern Demo -----\n");

        GUIFactory macFactory = new MacFactory();

        Button macBtn = macFactory.createButton();
        Checkbox macCheck = macFactory.createCheckbox();

        macBtn.paint();  // Output: Rendering Mac Button
        macCheck.render(); // Output: Rendering Mac Checkbox


        GUIFactory windowsFactory = new WindowsFactory();

        Button windowsBtn = windowsFactory.createButton();
        Checkbox windowsCheck = windowsFactory.createCheckbox();

        windowsBtn.paint();  // Output: Rendering Windows Button
        windowsCheck.render(); // Output: Rendering Windows Checkbox

        System.out.println("\n-----Ending Abstract Factory Method Pattern Demo -----\n");
    }
}