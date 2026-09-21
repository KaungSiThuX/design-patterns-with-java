package com.kst.creational.abstract_factory;

public class AbstractFactoryDemo
{
    static void main()
    {
        GUIFactory guiFactory = new MacGUIFactory();
        Button button = guiFactory.createButton();
        CheckBox checkBox = guiFactory.createCheckBox();

        button.click();
        checkBox.choose();
    }
}
