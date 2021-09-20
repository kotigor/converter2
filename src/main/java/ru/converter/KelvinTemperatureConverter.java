package ru.converter;

import ru.temperature.CelsiusTemperature;
import ru.temperature.KelvinTemperature;
import ru.temperature.Temperature;

public class KelvinTemperatureConverter implements TemperatureConverter{
    @Override
    public Temperature convertFromCelsius(Temperature temp) throws ClassCastException {
        if(temp instanceof CelsiusTemperature)
            return new KelvinTemperature(temp.getTemp() + 273.15);
        else
            throw new ClassCastException("Only celsius");
    }
}
