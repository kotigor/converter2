package ru.converter;

import ru.temperature.CelsiusTemperature;
import ru.temperature.KelvinTemperature;
import ru.temperature.Temperature;

public class CelsiusTemperatureConverter implements TemperatureConverter{
    @Override
    public Temperature convertFromCelsius(Temperature temp) throws ClassCastException {
        if(temp instanceof CelsiusTemperature)
            return new CelsiusTemperature(temp.getTemp());
        else
            throw new ClassCastException("Only celsius");
    }
}
