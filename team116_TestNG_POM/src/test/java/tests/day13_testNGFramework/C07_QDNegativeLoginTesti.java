package tests.day13_testNGFramework;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C07_QDNegativeLoginTesti {
    //1- https://www.qualitydemy.com/ anasayfasina gidin

    //2- login linkine basin
    // 3- 3 farkli test method’u olusturun.
    // - gecerli username, gecersiz password
    // - gecersiz username, gecerli password
    // - gecersiz username, gecersiz password.
    //4- Login butonuna basarak login olun
    //5- Basarili olarak giris yapilamadigini test edin
    @Test(groups = "smoke")
    public void validUsernameWithInvalidPass(){
        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        qualityDemyPage.FirstloginButton.click();
        qualityDemyPage.eMailBox.sendKeys(ConfigReader.getProperty("qdValidiUsername"));
        qualityDemyPage.passwordBox.sendKeys(ConfigReader.getProperty("qdInvalidPassword"));
        if (qualityDemyPage.cookiesAcceptButton.isDisplayed()) {
            qualityDemyPage.cookiesAcceptButton.click();
        }
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.elementToBeClickable(qualityDemyPage.secondLoginButton));
        ReusableMethods.bekle(2);
        qualityDemyPage.secondLoginButton.click();

        Assert.assertTrue(qualityDemyPage.eMailBox.isDisplayed());
        // we can be sure that we couldn't pass the page so there is still emailBox on page

    }
    @Test(groups = "smoke")
    public void invalidUsernameWithValidPass(){
        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        qualityDemyPage.FirstloginButton.click();
        qualityDemyPage.eMailBox.sendKeys(ConfigReader.getProperty("qdInvalidiUsername"));
        qualityDemyPage.passwordBox.sendKeys(ConfigReader.getProperty("qdValidPassword"));
        if (qualityDemyPage.cookiesAcceptButton.isDisplayed()) {
            qualityDemyPage.cookiesAcceptButton.click();
        }
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.elementToBeClickable(qualityDemyPage.secondLoginButton));
        ReusableMethods.bekle(2);
        qualityDemyPage.secondLoginButton.click();

        Assert.assertTrue(qualityDemyPage.eMailBox.isDisplayed());
        // we can be sure that we couldn't pass the page so there is still emailBox on page

    }
    @Test(groups = "smoke")
    public void invalidUsernameWithInvalidPass(){
        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        qualityDemyPage.FirstloginButton.click();
        qualityDemyPage.eMailBox.sendKeys(ConfigReader.getProperty("qdInvalidiUsername"));
        qualityDemyPage.passwordBox.sendKeys(ConfigReader.getProperty("qdInvalidPassword"));
        if (qualityDemyPage.cookiesAcceptButton.isDisplayed()) {
            qualityDemyPage.cookiesAcceptButton.click();
        }
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.elementToBeClickable(qualityDemyPage.secondLoginButton));
        ReusableMethods.bekle(2);
        qualityDemyPage.secondLoginButton.click();

        Assert.assertTrue(qualityDemyPage.eMailBox.isDisplayed());
        // we can be sure that we couldn't pass the page so there is still emailBox on page
        Driver.closeDriver();
    }
}
