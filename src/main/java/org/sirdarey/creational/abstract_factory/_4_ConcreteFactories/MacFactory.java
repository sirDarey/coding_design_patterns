package org.sirdarey.creational.abstract_factory._4_ConcreteFactories;

import org.sirdarey.creational.abstract_factory._1_ProductInterface.Button;
import org.sirdarey.creational.abstract_factory._1_ProductInterface.Checkbox;
import org.sirdarey.creational.abstract_factory._2_ConcreteFamilies.mac.MacButton;
import org.sirdarey.creational.abstract_factory._2_ConcreteFamilies.mac.MacCheckbox;
import org.sirdarey.creational.abstract_factory._3_GUIFactory.GUIFactory;


public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}