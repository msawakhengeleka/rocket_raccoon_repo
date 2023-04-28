package pages;
import controls.seleniumControls;
import org.openqa.selenium.By;

public class HomePage
{
    //object to use selenium functions
    seleniumControls seleniumControls = new seleniumControls();

    //elements locators on the page
    String addButtonXpath = "//a[@class=\"ajaxModalLauncher btn btn-primary\"]";

    String editButtonXpath ="//a[contains(text(),\"edit\")]";
    String deleteButtonXpath ="";
    String inCompleteButtonXpath ="";
    String completedButtonXpath ="";
    String rowXpath ="";
    String titleTextBoxXpath ="//input[@id=\"staticEmail\"]";
    String descriptionTextBoxXpath ="//textarea[@name=\"description\"]";
    String submitButtonXpath ="//input[@class=\"btn btn-primary btn-block\"]";
    String editSubmitButtonXpath="//button[@class=\"btn btn-primary btn-block\"]";
    String cancelButtonXpath ="//a[@class=\"btn btn-secondary btn-block\"]";

    //Steps to add a new item
    public void addNewItem() throws InterruptedException {
        seleniumControls.click(By.xpath(addButtonXpath));
        Thread.sleep(3000);

        seleniumControls.enterKeys(By.xpath(titleTextBoxXpath),"Test1");

        seleniumControls.enterKeys(By.xpath(descriptionTextBoxXpath),"Desc Test1");

        seleniumControls.click(By.xpath(submitButtonXpath));
    }

    //Steps to edit a existing item
    public void editingItem() throws InterruptedException {
        seleniumControls.click(By.xpath(editButtonXpath));
        Thread.sleep(3000);

        seleniumControls.clearText(By.xpath(descriptionTextBoxXpath));
        seleniumControls.enterKeys(By.xpath(descriptionTextBoxXpath),"Edited Desc Test1");

        seleniumControls.click(By.xpath(editSubmitButtonXpath));
    }
}
