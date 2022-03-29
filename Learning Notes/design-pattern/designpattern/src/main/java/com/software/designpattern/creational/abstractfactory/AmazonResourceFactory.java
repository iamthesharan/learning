package com.software.designpattern.creational.abstractfactory;

public class AmazonResourceFactory implements  ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMb) {
        return new S3Storage(capMb );
    }
}
