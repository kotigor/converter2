import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.converter.TemperatureConverter;
import ru.temperature.CelsiusTemperature;
import ru.temperature.Temperature;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter degrees Celsius to convert: ");
        Temperature temp = context.getBean("temperature", CelsiusTemperature.class);
        temp.setTemp(in.nextDouble());
        TemperatureConverter converter = context.getBean("converter", TemperatureConverter.class);
        System.out.println("Result: " + converter.convertFromCelsius(temp));
    }
}
