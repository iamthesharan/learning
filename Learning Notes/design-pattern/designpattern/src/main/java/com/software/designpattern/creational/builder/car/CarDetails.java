package com.software.designpattern.creational.builder.car;

public class CarDetails {
    private String carCompany;
    private String carName;
    private String carModel;
    private String carSpeed;
    private String carMillage;
    private String carType;
    private Engine engine;

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(String carSpeed) {
        this.carSpeed = carSpeed;
    }

    public String getCarMillage() {
        return carMillage;
    }

    public void setCarMillage(String carMillage) {
        this.carMillage = carMillage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
