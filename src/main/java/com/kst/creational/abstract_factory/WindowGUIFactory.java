package com.kst.creational.abstract_factory;

public class WindowGUIFactory implements GUIFactory
{
    @Override
    public Button createButton()
    {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox()
    {
        return new WindowCheckBox();
    }
}
