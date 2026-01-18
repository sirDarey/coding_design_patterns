package com.sirdarey.creational.abstract_factory._3_GUIFactory;

import com.sirdarey.creational.abstract_factory._1_ProductInterface.Button;
import com.sirdarey.creational.abstract_factory._1_ProductInterface.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}