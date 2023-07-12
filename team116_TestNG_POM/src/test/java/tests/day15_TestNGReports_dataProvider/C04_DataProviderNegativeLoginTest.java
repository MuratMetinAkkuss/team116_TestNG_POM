package tests.day15_TestNGReports_dataProvider;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.net.UnknownServiceException;

public class C04_DataProviderNegativeLoginTest extends TestBaseReport {

    @DataProvider
    public static Object[][] userList() {

        String[][] userNamePasswords = {{"Sevda","12344"},
                                        {"murat","213213"},
                                        {"ilknur","21312"},
                                        {"asdass","123213"}};

        return userNamePasswords;
    }

    @Test(dataProvider = "userList")
    public void cokluNegativeLoginTest(String userName ,String passWord){
        extentTest = extentReports.createTest("Data Provider","coklu negatif test");
        // Qualitydemy anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));

        // liste olarak verilen kullanici adi ve sifreleri ile
        // giris yapilamadigini test edin
        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        // ilk login linkine tiklayin
        qualityDemyPage.FirstloginButton.click();

        // kullanici adi ve sifresini yazip giris yapmayi deneyin
        qualityDemyPage.eMailBox.sendKeys(userName);
        qualityDemyPage.passwordBox.sendKeys(passWord);
        qualityDemyPage.cookiesAcceptButton.click();
        ReusableMethods.bekle(3);
        qualityDemyPage.secondLoginButton.click();
        extentTest.info("Verilen yanlis kullanici adlariyla giris yapar");
        // giris yapilamadigini test edin
        Assert.assertTrue(qualityDemyPage.eMailBox.isDisplayed());
        extentTest.pass("Yanlis info ile girildigini test eder");
        // sayfayi kapatin
        Driver.closeDriver();
    }

}
