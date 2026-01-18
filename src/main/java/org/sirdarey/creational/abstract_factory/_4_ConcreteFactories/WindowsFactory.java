package org.sirdarey.creational.abstract_factory._4_ConcreteFactories;

import org.sirdarey.creational.abstract_factory._1_ProductInterface.Button;
import org.sirdarey.creational.abstract_factory._1_ProductInterface.Checkbox;
import org.sirdarey.creational.abstract_factory._2_ConcreteFamilies.windows.WindowsButton;
import org.sirdarey.creational.abstract_factory._2_ConcreteFamilies.windows.WindowsCheckbox;
import org.sirdarey.creational.abstract_factory._3_GUIFactory.GUIFactory;


public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}