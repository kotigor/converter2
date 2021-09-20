package ru.converter;

import ru.temperature.CelsiusTemperature;
import ru.temperature.FahrenheitTemperature;
import ru.temperature.KelvinTemperature;
import ru.temperature.Temperature;

public class FahrenheitTemperatureConverter implements TemperatureConverter{
    @Override
    public Temperature convertFromCelsius(Temperature temp) throws ClassCastException {
        if(temp instanceof CelsiusTemperature)
            return new FahrenheitTemperature(1.8 * temp.getTemp() + 32);
        else
            throw new ClassCastException("Only celsius");
    }
}
