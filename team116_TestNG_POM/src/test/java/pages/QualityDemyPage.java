package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage {
    public QualityDemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement FirstloginButton;

    @FindBy(xpath = "//*[@id='login-email']")
    public WebElement eMailBox;

    @FindBy(xpath = "//*[@id='login-password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement secondLoginButton;

    @FindBy(xpath = "//*[@onclick='cookieAccept();']")
    public WebElement cookiesAcceptButton;

}
