package techproed.test.day22_Annotation;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.*;

public class C01_Annotation {
    /*
    @Test:
    @BeforeSuite
    @AfterSuite
    @BeforeTest
    @AfterTest
    @BeforeClass
    @AfterClass
    @BeforeMethod
    @AfterMethod
    --TestNg'de @BeforeGroups, @AfterGroups, @FindBy gibi notasyonlar vardır
     */



    @Test
    public  void test1(){
        System.out.println("Test1 Çalıştı");
    }

    @Test
    public  void test2(){
        System.out.println("Test2 Çalıştı");
    }

    @Test
    public  void test3(){
        System.out.println("Test3 Çalıştı");
    }


    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }

    @BeforeClass
    public  void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public  void  afterClass(){
        System.out.println("After Class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }



}
