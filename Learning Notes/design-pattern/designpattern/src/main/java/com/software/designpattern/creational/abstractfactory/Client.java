package com.software.designpattern.creational.abstractfactory;

public class Client {
    private ResourceFactory resourceFactory;
    public Client(ResourceFactory resourceFactory){
        this.resourceFactory=resourceFactory;
    }
    public Instance createServer(Instance.Capacity capacity, int capMb){
        Instance instance=new Ec2Instance(capacity);
        Storage storage=new S3Storage(capMb);
        instance.attachStorageStorage(storage);
        return instance;
    }
    public static void main(String ...args){
        Client aws=new Client(new AmazonResourceFactory());
        Instance i=aws.createServer(Instance.Capacity.large,20);
        i.start();
        i.stop();
    }
}
