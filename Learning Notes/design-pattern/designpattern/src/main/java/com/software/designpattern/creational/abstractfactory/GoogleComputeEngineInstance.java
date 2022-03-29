package com.software.designpattern.creational.abstractfactory;

public class GoogleComputeEngineInstance implements Instance{

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance Started");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance Stopped");
    }

    @Override
    public void attachStorageStorage(Storage storage) {
        System.out.println("Attached "+storage+" to Compute engine instance");
    }
}
