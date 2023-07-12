package tests.day15_TestNGReports_dataProvider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderAmazonAramaTest {

    @DataProvider
    public static Object[][] AranacakUrunListesi() {
        //Data provider notasyonuna sahip methodlar
        //cift katli array dondurmek zorundadir

        String[][] urunList = {{"Nutella"},{"Cokokrem"},{"Java"},{"Selenium"},{"Apple"},{"Samsung"}};
        return urunList;
    }

    @Test(dataProvider = "AranacakUrunListesi")
    public void cokluAramaTest(String aranacakUrun){
        //amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //verilen listedeki her bir urun icin ayri ayri
        // arama yapip, sonuclarin o urunu icerdigini test edin
        //nutella cokokrem java selenium apple samsung

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.serachBox.sendKeys(aranacakUrun + Keys.ENTER);
        Assert.assertTrue(amazonPage.resultElement.getText().contains(aranacakUrun));

        Driver.closeDriver();
    }
}
