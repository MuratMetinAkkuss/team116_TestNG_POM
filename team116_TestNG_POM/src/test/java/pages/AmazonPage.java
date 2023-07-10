package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        //baska package'daki constructor'larin kullanabilmesi icin
        //access modifier'ini public yapalim


        //bu page class'indan locate kullanacak tum class'lar
        //AmazonPage class'indan obje olusturmali
        //obje olusturmak icin de mutlaka bu Constructor calisacak
        //o zaman bu class'da WebDriver'imizi tanimlama isini
        //bu constructor icinde yapabiliriz.

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "twotabsearchtextbox")
    public WebElement serachBox;

    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement resultElement;

}
