package com.software.designpattern.creational.prototype;
//This is the Unique Unit and we don't want to create Copies of the object.
public class General extends GameUnit{
    @Override
    public GameUnit clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not Supported");
    }
}
