package ru.temperature;

public class CelsiusTemperature extends Temperature{
    public CelsiusTemperature(double temp){
        super(temp);
    }
    public CelsiusTemperature(){}

    @Override
    public String toString() {
        return super.toString() + " celsius";
    }
}
