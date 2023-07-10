package tests.day13_testNGFramework;

import org.testng.annotations.*;

public class C05_Notations {

    @BeforeSuite
    public void setupSuit(){
        System.out.println("Before suit was worked");
    }

    @AfterSuite
    public void teardownSuite(){
        System.out.println("After suit was worked");
    }

    @BeforeTest
    public void setupTest(){
        System.out.println("Before Test was worked");
    }

    @AfterTest
    public void teardownTest(){
        System.out.println("After test was worked");
    }

    @BeforeClass
    public void setupClass(){
        System.out.println("Before class was worked");
    }

    @AfterClass
    public void teardownClass(){
        System.out.println("After class was worked");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("Before method was worked");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("After method was worked");
    }

    @Test
    public void test01(){
        System.out.println("Test 01 was worked");
    }

    @Test
    public void test02(){
        System.out.println("Test 02 was worked");
    }


}
