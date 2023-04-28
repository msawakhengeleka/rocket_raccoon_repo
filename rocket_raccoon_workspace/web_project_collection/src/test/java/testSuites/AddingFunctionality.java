package testSuites;

import org.testng.annotations.Test;
import pages.HomePage;

import static configs.Base.driver;
import static configs.Base.seleniumControls;

public class AddingFunctionality {

    //create pages objects
    HomePage homePage = new HomePage();

    //Tests
    @Test
    public void AddingTest() throws InterruptedException {
        seleniumControls.startTheApplication();

        homePage.addNewItem();

        Thread.sleep(2000);
        driver.close();
    }
}
