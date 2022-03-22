package com.software.designpattern.creational.factorymethod.message;

public class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
