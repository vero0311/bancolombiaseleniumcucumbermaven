package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FreeInvestmentCreditHomePage {

    public FreeInvestmentCreditHomePage(WebDriver myDriver){
        this.myDriver = myDriver;
        PageFactory.initElements(myDriver,this);
    }

    private WebDriver myDriver;
    private JavascriptExecutor js;

    @FindBy(xpath = "//a[@title=\"Simulador\" and @class=\"btn btn-primary\" ]")
    private WebElement simulatorButton;

    public void enterToSimulator(){
        js = (JavascriptExecutor) myDriver;
        js.executeScript ("arguments [0] .scrollIntoView ();", simulatorButton);
        simulatorButton.click();
    }


}
