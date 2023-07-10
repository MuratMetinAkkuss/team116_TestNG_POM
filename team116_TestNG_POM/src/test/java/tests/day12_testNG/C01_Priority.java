package tests.day12_testNG;

import org.testng.annotations.Test;

public class C01_Priority {

    /*
        JUnit'de hangi testin once calisacagini ONGOREMEYIZ ve KONTROL EDEMEYIZ
        TestNG testleri naturel order'a gore calistirir.


     */
    @Test(priority = 3)
    public void amazonTest(){
        System.out.println("Amazon");
    }
    @Test(priority = 2)
    public void youtubeTest(){
        System.out.println("Youtube");
    }
    @Test(priority = 1)
    public void wiseTest(){
        System.out.println("WiseQuarter");
    }

}
