package com.software.designpattern.creational.singleton.eager;

public class Client {
    public static void main(String ...args){
        EagerRegistry eagerRegistry=EagerRegistry.getInstance();
        EagerRegistry eagerRegistry1=EagerRegistry.getInstance();
        System.out.println(eagerRegistry);
        System.out.println(eagerRegistry1);
    }
}
