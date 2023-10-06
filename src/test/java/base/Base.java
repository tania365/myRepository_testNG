package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class Base {
    public static WebDriver driver;

    @BeforeSuite
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("BeforeSuite");

    }

    @BeforeTest
    public void exampleOfBeforeTest() {
        System.out.println("  BeforeTest");
    }

    @BeforeClass
    public void exampleOfBeforeClass() {
        System.out.println("    BeforeClass");
    }

    @BeforeMethod
    public void exampleOfBeforeMethod() {
        System.out.println("      BeforeMethod");
    }

    @Test
    public void exampleOfTest() {
        System.out.println("        Test");
    }

    @AfterMethod
    public void exampleOfAfterMethod() {
        System.out.println("      AfterMethod");
    }

    @AfterClass
    public void exampleOfAfterClass() {
        System.out.println("    AfterClass");
    }

    @AfterTest
    public void exampleOfAfterTest() {
        System.out.println("  AfterTest");
    }

    @AfterSuite
    public void close() throws InterruptedException {
        // Thread.sleep(600);
        // driver.close();//to close current tab of the browser
        driver.quit();//to close Browser Application or Window
        System.out.println("AfterSuite");
    }

    public static void navigate(String url) {
        driver.get(url);
    }
    public static void click(By locator) {
        driver.findElement(locator).click();
    }
    public static void sendKeys(By locator, String keys) {
        driver.findElement(locator).sendKeys(keys);
    }
    public static String getText(By locator) {
        String s = driver.findElement(locator).getText();
        return s;
    }


}



