package com.software.designpattern.creational.abstractfactory;

public interface Instance {
    enum Capacity{micro, small, large};
    public void start();
    public void stop();
    public void attachStorageStorage(Storage storage);
}
