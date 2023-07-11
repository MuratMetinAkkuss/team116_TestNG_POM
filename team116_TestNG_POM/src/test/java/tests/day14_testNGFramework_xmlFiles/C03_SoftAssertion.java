package tests.day14_testNGFramework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_SoftAssertion {

    @Test(groups = "mini regression1")
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //soft assertion kullanmak icin obje olusturmaliyiz.
        SoftAssert softAssert = new SoftAssert();
        //istedigimiz tum testleri soft assert objesini kullanarak yapin

        //title'in best iermedigini test edin
        String unexpectedContent = "best";
        String actualTitle = Driver.getDriver().getTitle();
        softAssert.assertFalse(actualTitle.contains(unexpectedContent));

        // Url'in https://www.amazon.com/ oldugunu test edin
        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);

        //Nutella aratin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.serachBox.sendKeys("Nutella" + Keys.ENTER);

        //arama sonuclarinin nutella icerdigini test edin
        String expectedContent = "Nutella";
        String actualContent = amazonPage.resultElement.getText();
        softAssert.assertTrue(actualContent.contains(expectedContent));

        //tum testlerimiz bittiginde softAssert objesinin not aldigi hatalari
        //raporlamasini isteyelim

        softAssert.assertAll();

        /*
            softAssert komutu tum yukarida yapilan testleri raporlar
            failed olan her hangi bir assertion varsa
            AssertionError verip calismayi durdurur,
            Ancak tum hatalari assertAll satirinda verir
            hatalarin yerini bulmamiz ve duzeltmemiz icin
            softAssert ile yapilan assertion'larda
            mutlaka aciklama yazilmalidir.
         */

        Driver.closeDriver();



    }

}
