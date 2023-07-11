package tests.day14_testNGFramework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_TestNGAssertions {

    @Test
    public void nutellaTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        String unExpectedUrl = "best";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertFalse(actualTitle.contains(unExpectedUrl),"Title'da istenmeyen icerik");


        String expectedUrl = "https://www.amazon.com/";
        String actualUral = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUral,expectedUrl,"Url beklenenden farkli");


        AmazonPage amazonPage = new AmazonPage();
        amazonPage.serachBox.sendKeys("Nutella" + Keys.ENTER);

        String expectedContent = "Nutella";
        String actualConten = amazonPage.resultElement.getText();
        Assert.assertTrue(actualConten.contains(expectedContent),"Arama sonucu Nutella icermiyor");




    }
}
