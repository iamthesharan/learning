package com.software.designpattern.creational.factorymethod.message;

public abstract class MessageCreator {
    public Message getMessage(){
        Message msg=createMessage();
        return msg;
    }
    public abstract Message createMessage();
}
