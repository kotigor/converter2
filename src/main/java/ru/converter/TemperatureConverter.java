package ru.converter;

import ru.temperature.Temperature;

public interface TemperatureConverter {
    public Temperature convertFromCelsius(Temperature temp);
}
