package Pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends DriverManager {
@FindBy(css = ".font-condensed.search-title__term")
    private WebElement selectedItem;

    public String headerTxt(){
    return selectedItem.getText();
    }

}
