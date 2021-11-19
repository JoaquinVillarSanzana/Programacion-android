package com.jvillar.prueba2;

public class Sensor {
    private String nameSensor;
    private String valueSensor;

    public Sensor(String nameSensor, String valueSensor) {
        this.nameSensor = nameSensor;
        this.valueSensor = valueSensor;
    }

    public Sensor() {
    }

    public String getNameSensor(){
        return nameSensor;
    }

    public void setNameSensor(String nameSensor){
        this.nameSensor = nameSensor;
    }

    public String getValueSensor(){
        return valueSensor;
    }

    public void setValueSensor(String valueSensor){
        this.valueSensor = valueSensor;
    }
}
