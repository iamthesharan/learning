package com.software.designpattern.creational.factorymethod.message;

public class JsonMessage extends Message{
    @Override
    String getContent() {
        return "{\"JSON]\":[]}";
    }
}
