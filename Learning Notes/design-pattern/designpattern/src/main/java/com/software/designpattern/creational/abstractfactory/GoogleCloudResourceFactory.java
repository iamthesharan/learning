package com.software.designpattern.creational.abstractfactory;

public class GoogleCloudResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMb) {
        return new GoogleCloudStorage(capMb);
    }
}
