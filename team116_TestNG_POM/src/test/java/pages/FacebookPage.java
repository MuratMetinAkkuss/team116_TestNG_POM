package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
   public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
    @FindBy(xpath = "//*[@title='Decline optional cookies']")
    public WebElement cookiesButton;

    @FindBy(id = "email")
    public WebElement eMailInput;

    @FindBy(id = "pass")
    public WebElement passInput;

    @FindBy( xpath = "//*[@name='login']")
    public WebElement loginButton;

    @FindBy(id = "error_box")
    public WebElement invalidInputErrorBox;
}
