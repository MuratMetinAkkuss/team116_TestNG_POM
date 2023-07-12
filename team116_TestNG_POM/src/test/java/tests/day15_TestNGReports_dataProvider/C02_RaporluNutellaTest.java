package tests.day15_TestNGReports_dataProvider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class C02_RaporluNutellaTest extends TestBaseReport {

    @Test
    public void raporluTest(){
        //amazona gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutella icin arama yapin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.serachBox.sendKeys("Nutella"+ Keys.ENTER);
        //sonuclarin nutella icerdigini test edin
        String expectedResult = "Nutella";
        String actualResult = amazonPage.resultElement.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        //sayfayi kapatin
        Driver.closeDriver();
    }
}
