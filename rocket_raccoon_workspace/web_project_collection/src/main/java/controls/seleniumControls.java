package controls;

import configs.Base;
import org.openqa.selenium.By;

import static configs.BrowserFactory.openBrowser;

public class seleniumControls extends Base
{
    //This class will contain the selenium functions

    // start the application by specifying which url to hit when browser is opened extended Base class to be able to use driver
    public void startTheApplication()
    {
        openBrowser("https://beta.warrenroman.com/project-rocket-raccoon/home");
    }

    //selenium functions
    public void click(By element){
        driver.findElement(element).click();
    }

    public void enterKeys(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public void clearText(By element){driver.findElement(element).clear();}
}
