package tests.day13_testNGFramework;

import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C06_QDLoginTest {
    @Test(groups = {"smoke","mini regression1","regression"})
    public void test01(){
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        //2- login linkine basin
        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        qualityDemyPage.FirstloginButton.click();
        // 3- Kullanici email’i olarak valid email girin
        qualityDemyPage.eMailBox.sendKeys(ConfigReader.getProperty("qdValidiUsername"));
        // 4- Kullanici sifresi olarak valid sifre girin
        qualityDemyPage.passwordBox.sendKeys(ConfigReader.getProperty("qdValidPassword"));
        // 5- Login butonuna basarak login olun
        qualityDemyPage.cookiesAcceptButton.click();
        ReusableMethods.stop(3);
        qualityDemyPage.secondLoginButton.click();
        // 6- Basarili olarak giris yapilabildigini test edin
    }
}
