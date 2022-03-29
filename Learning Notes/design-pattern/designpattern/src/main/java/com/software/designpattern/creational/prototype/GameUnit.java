package com.software.designpattern.creational.prototype;


import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable{
    //This Represents the Position of the GameUnit object in map
    private Point3D position; // Point3D is an immutable Class. once you create an object, you cannot modify it.
    public GameUnit(){
        this.position= Point3D.ZERO;
    }
    @Override
    public GameUnit clone() throws  CloneNotSupportedException{
        GameUnit unit=(GameUnit) super.clone(); // here unit is the shallow copy of the object.
        unit.initialize();
        return unit;
    }
    protected void initialize(){
        // this resets the state of the unit whenever a new copy is created.
        this.position=Point3D.ZERO;
        reset();
    }
    // in case of initialize we are just resetting the objects of the base class and not child class
    // One Approach would be to Override Initialize method in child class
    // Instead of that you can use Abstract reset method and call reset() from initialize method.
    protected abstract void reset();
    public GameUnit(float x, float y, float z){
        position=new Point3D(x,y,z);
    }

    public Point3D getPosition() {
        return position;
    }
    public void move(Point3D direction,float distance){
        Point3D finalMove=direction.normalize();
        finalMove=finalMove.multiply(distance);
        position=position.add(finalMove);
    }
}
