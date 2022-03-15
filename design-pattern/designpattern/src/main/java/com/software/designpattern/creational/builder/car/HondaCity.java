package com.software.designpattern.creational.builder.car;

public class HondaCity{
    private String carName;
    private String carType;
    private String carSpeed;
    private String millage;
    private String engine;

    public String getCarName() {
        return carName;
    }

    private void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    private void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    private void setCarSpeed(String carSpeed) {
        this.carSpeed = carSpeed;
    }

    public String getMillage() {
        return millage;
    }

    private void setMillage(String millage) {
        this.millage = millage;
    }

    public String getEngine() {
        return engine;
    }

    private void setEngine(String engine) {
        this.engine = engine;
    }
    public static CarBuilder getCarBuilder(){
        return new CarBuilder();
    }
    public static class CarBuilder{
        private String carCompany;
        private String carName;
        private String carModel;
        private String carType;
        private String carSpeed;
        private String carMillage;
        private String engine;
        private HondaCity hondaCity;

        public CarBuilder withCarCompany(String carCompany){
            this.carCompany=carCompany;
            return this;
        }
        public CarBuilder withCarName(String carName){
            this.carName=carName;
            return this;
        }
        public CarBuilder withCarModel(String carModel){
            this.carModel=carModel;
            return this;
        }
        public CarBuilder withCarSpeed(String carSpeed){
            this.carSpeed=carSpeed;
            return this;
        }
        public CarBuilder withCarMillage(String carMillage){
            this.carMillage=carMillage;
            return this;
        }
        public CarBuilder withCarEngine(Engine engine){
            this.engine=engine.getEngineName()+" - "+engine.getEnginePower();
            return this;
        }
        public CarBuilder withCarType(String carType){
            this.carType=carType;
            return this;
        }
        public HondaCity build(){
            this.hondaCity=new HondaCity();
            this.hondaCity.setCarName(this.carCompany+" "+this.carName+" "+this.carModel);
            this.hondaCity.setCarType(this.carType);
            this.hondaCity.setCarSpeed(this.carSpeed);
            this.hondaCity.setMillage(this.carMillage);
            this.hondaCity.setEngine(this.engine);
            return this.hondaCity;
        }
        public HondaCity getHondaCity(){
            return this.hondaCity;
        }
    }
}
