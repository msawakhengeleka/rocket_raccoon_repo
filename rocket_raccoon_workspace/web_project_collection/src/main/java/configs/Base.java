package configs;

import controls.seleniumControls;
import org.openqa.selenium.WebDriver;

public class Base
{
    //Base class is initializing the driver to be used across the project by extending the Base class
    public static WebDriver driver;

    //Declaring seleniumControls inside base so it can be used globally as the base is extended, avoid importing all the time selenium is needed
    public static seleniumControls seleniumControls = new seleniumControls();
}
