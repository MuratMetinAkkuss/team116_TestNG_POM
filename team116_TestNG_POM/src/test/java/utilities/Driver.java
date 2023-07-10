package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    public static WebDriver driver;
    public static WebDriver getDriver(){
        /*
            Bundan sonra daha once driver olarak
            TestBase'den alip kullandigimiz
            WebDriver'in yerine

            Driver class'indan getDriver method'unu kullanacagiz
            ANCAK
            mahserin 4 atlisinda kullandigimiz

            driver = new ChromeDriver();
            problem olusturuyor

            CUNKU her calisitiginda yeniden bir WebDriver olusturuyor.

            Bizim istedigimiz su :

            Ben testimi calistirmaya basladigimda ilk kez bu method'u
            kullaninca Chrome Driver olusturusun sonraki kullanimlarda
            olusturmasin

            BUNUN icin driver null kabul edip ona gore yeni driver atamasi
            yapiyoruzz

            null degerini if ile beraber kullaniyoruz.


         */
        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

    public static void closeDriver(){
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
}
