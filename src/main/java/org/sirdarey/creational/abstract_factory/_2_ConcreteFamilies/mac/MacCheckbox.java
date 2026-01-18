package org.sirdarey.creational.abstract_factory._2_ConcreteFamilies.mac;

import org.sirdarey.creational.abstract_factory._1_ProductInterface.Checkbox;


public class MacCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Rendering Mac Checkbox");
    }
}