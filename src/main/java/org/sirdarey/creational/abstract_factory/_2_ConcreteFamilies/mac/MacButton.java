package org.sirdarey.creational.abstract_factory._2_ConcreteFamilies.mac;

import org.sirdarey.creational.abstract_factory._1_ProductInterface.Button;


public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Mac Button");
    }
}