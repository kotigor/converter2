import ru.converter.CelsiusTemperatureConverter;
import ru.converter.FahrenheitTemperatureConverter;
import ru.converter.KelvinTemperatureConverter;
import ru.converter.TemperatureConverter;

import java.util.Locale;

public class TemperatureConverterFactory {
    public TemperatureConverter create(Locale locale){
        String lang = locale.getLanguage();
        TemperatureConverter converter;
        switch (lang){
            case "en":
                converter = new FahrenheitTemperatureConverter();
                break;
            case "de": //пусть в Германии используют шкалу Кельвина)
                converter = new KelvinTemperatureConverter();
                break;
            default:
                converter = new CelsiusTemperatureConverter();
                break;
        }
        return converter;
    }
}
