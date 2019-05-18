package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    private String browser;
    public DriverManager(){
        PageFactory.initElements(driver,this);
    }
    public void openBowser(String browser){
        switch (browser){
            case"chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case"firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                WebDriverManager.iedriver().setup();
                driver= new InternetExplorerDriver();
                break;
        }}
    public void navigateTo(String url){
        driver.get(url);
    }
    public void maxBrowser(){
        driver.manage().window().maximize();
    }
    public void applyImplicit(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void sleep(int ms){
        try{Thread.sleep(ms);}
        catch (Exception e){
            e.printStackTrace();}
    }
    public void handleCookies(){

        driver.findElement(By.linkText("GOT IT")).click();
    }
    public void waitUntilElementClickable(WebElement element){
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(element));}
    public Boolean waitUntilElementInvisible(By by){return
            new WebDriverWait(driver,10).until(ExpectedConditions.invisibilityOfElementLocated(by));

    }
    public void closeBrowser(){

        driver.close();}
}
