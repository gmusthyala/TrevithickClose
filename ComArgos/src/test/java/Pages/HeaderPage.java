package Pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends DriverManager {

    @FindBy(id = "searchTerm")
    private WebElement searchTxtBox;
    @FindBy(css = "._1gqeQ")
    private WebElement searchBtn;

    public static String searchproduct;

    public void doSearch(String product){
        searchproduct= product;
        searchTxtBox.sendKeys(product);

        searchBtn.click();
    }


    public String getCurrentUrl(){
     return  driver.getCurrentUrl();
    }

}
