package com.software.designpattern.creational.singleton.eager;

public class EagerRegistry {
    private EagerRegistry(){}
    private static final EagerRegistry INSTANCE=new EagerRegistry();
    public static EagerRegistry getInstance(){
        return INSTANCE;
    }
}
