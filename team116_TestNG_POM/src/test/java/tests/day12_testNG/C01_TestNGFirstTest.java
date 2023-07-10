package tests.day12_testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C01_TestNGFirstTest {
    @Test
    public void test01(){

        /*
            POM'de driver olusturmak ve gerekli ayarlari yapmak icin
            TestBase kullanmak yerine
            ayri bir driver class'i icerisinde
            bize driver dondurecek bir method olusturulmasi tercih edilmistir

         */
        Driver.getDriver().get("https://www.amazon.com");

        ReusableMethods.stop(4);

        Driver.closeDriver();
    }
    @Test
    public void test02(){
        //youtube anasayfaya gidin
        Driver.getDriver().get("htpps://www.youtube.com");
        //url'i yazdirin
        System.out.println(Driver.getDriver().getCurrentUrl());
        //sayfayi kapatin
        Driver.closeDriver();
    }
}
