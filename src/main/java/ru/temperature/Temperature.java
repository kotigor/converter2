package ru.temperature;

public class Temperature {
    private double temp;

    public Temperature(double temp){
        this.temp = temp;
    }

    public Temperature(){}

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return String.valueOf(temp);
    }
}
