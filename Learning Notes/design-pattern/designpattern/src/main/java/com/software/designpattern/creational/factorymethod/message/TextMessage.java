package com.software.designpattern.creational.factorymethod.message;

public class TextMessage extends Message{
    @Override
    String getContent() {
        return "Text";
    }
}
