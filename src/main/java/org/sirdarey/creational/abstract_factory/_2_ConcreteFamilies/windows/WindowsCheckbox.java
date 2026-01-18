package org.sirdarey.creational.abstract_factory._2_ConcreteFamilies.windows;

import org.sirdarey.creational.abstract_factory._1_ProductInterface.Checkbox;


public class WindowsCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
}