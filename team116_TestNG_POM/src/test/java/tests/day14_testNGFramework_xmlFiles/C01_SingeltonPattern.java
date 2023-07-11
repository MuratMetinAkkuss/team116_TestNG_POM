package tests.day14_testNGFramework_xmlFiles;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SingeltonPattern {

    @Test
    public void test01(){

        //open amazon
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        /*
            SingletonPattern : bir class'da obje olusuturulmasini engellemek icin kullanilan bir
            yontemdir. POM'de WebDriver olarak driver class'indaki
            getDriver(); method'u kullanilsin istiyoruz

            Driver objemizin access modifier'ini degistirerek kullanimini engelledik

            Driver class'inin farkli kullanimini engellemek icin
            POM tasarlayanlar singleton pattern kullanmistir

            singleton pattern istenen class'dan obje olsuturulmasini engellemek icin
            parametresiz constructor;i gorunur yapip
            access modifier'ini private yaparak
            istenen class'dan obje yapilmasini onler

            Singleton pattern kullanarak hem cons hem de driver private yapilarak
            Driver class'inda olan drivera erisim engellenmistir.
            Sadece biizim istedigimiz sekilde driver erisilebilir olmustur.

         */





    }
}
