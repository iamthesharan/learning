package com.software.designpattern.creational.factorymethod.message;

public class Client {
    public static void main(String ...args){
        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());
    }
    public static void printMessage(MessageCreator messageCreator){
        Message msg=messageCreator.getMessage();
        System.out.println(msg);
    }
}
