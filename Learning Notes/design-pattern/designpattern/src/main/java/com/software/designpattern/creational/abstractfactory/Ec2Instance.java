package com.software.designpattern.creational.abstractfactory;

public class Ec2Instance implements Instance{
    public Ec2Instance(Capacity capacity) {
        System.out.println("Created EC2 Instance");
    }
    @Override
    public void start() {
        System.out.println("EC2 Instance Started");
    }
    @Override
    public void stop() {
        System.out.println("EC2 Instance Stopped");
    }
    @Override
    public void attachStorageStorage(Storage storage) {
        System.out.println("Attached "+storage+" to EC2 Instance");
    }
}
