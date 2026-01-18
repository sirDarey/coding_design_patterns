package org.sirdarey.creational.abstract_factory._3_GUIFactory;

import org.sirdarey.creational.abstract_factory._1_ProductInterface.Button;
import org.sirdarey.creational.abstract_factory._1_ProductInterface.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}