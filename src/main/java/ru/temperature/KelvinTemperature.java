package ru.temperature;

public class KelvinTemperature extends Temperature{
    public KelvinTemperature(double temp){
        super(temp);
    }
    public KelvinTemperature(){}

    @Override
    public String toString() {
        return super.toString() + " kelvin";
    }
}
