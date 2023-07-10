package tests.day13_testNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C01_PagesFirstTest {
    @Test
    public void amazonTest(){

        //amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");

        //nutella icin arama yapin
        //arama kutusunun locator'ina ihtiyacimiz var
        //locator 'larimiz artik pages class'larinda
        //locator'lar static olmadigi icin obje olustururak kullanabiliriz

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.serachBox.sendKeys("Nutella" + Keys.ENTER);

        //sonuclarin nutella icerdigini test edin
        String expectedResult = "Nutella";
        String actualResult = amazonPage.resultElement.getText();

        Assert.assertTrue(actualResult.contains(expectedResult));

        //sayfayi kapatin

    }
}
