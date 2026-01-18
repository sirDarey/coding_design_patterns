package com.sirdarey.creational.abstract_factory._2_ConcreteFamilies.windows;

import com.sirdarey.creational.abstract_factory._1_ProductInterface.Button;


public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Windows Button");
    }
}