package configs;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory extends Base
{
    //Method to set the web driver for any browser to be used
    public static void openBrowser(String URL)
    {
        //specifying the location of web driver while setting the system property
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/test_artifacts/webdrivers/chromedriver.exe");

        //driver object is derived from the Base class. setting the type of web driver to run and the open the url of the application
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);
    }
}
