package techproed.tests.day23_DependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C03_SoftAssertion {

   SoftAssert softAssert;

   WebDriver driver;
   @Test()
   public void amazonTest() {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      softAssert= new SoftAssert();
      driver.get("https://amazon.com");
      softAssert.assertAll();

      softAssert.assertEquals(driver.getCurrentUrl(),"https://amazon.com.tr");
      softAssert.assertTrue(driver.getTitle().contains("best"));

      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
      WebElement sonuc=driver.findElement(By.xpath("//span[contains(text(),'\"iphone\"')]"));
      softAssert.assertTrue(sonuc.getText().contains("samsung"));



      }

   }

