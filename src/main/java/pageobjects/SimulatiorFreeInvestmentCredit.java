package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SimulatiorFreeInvestmentCredit {

    public SimulatiorFreeInvestmentCredit(WebDriver myDriver){
       this.myDriver=myDriver;
        PageFactory.initElements(myDriver,this);
    }

    private WebDriver myDriver;
    //@FindBy(xpath = "//span[@class=\"ng-binding\" and @ng-show=\"(creditoconsumoForm.comboTipoSimulacion.$viewValue=='' || creditoconsumoForm.comboTipoSimulacion.$viewValue.label=='' || creditoconsumoForm.comboTipoSimulacion.$viewValue===undefined) \"]") //generado por google
   @FindBy(xpath = "//*[@id=\"sim-detail\"]/form/div[2]/select")
    private WebElement aboutSimulate;

   @FindBy(xpath = "//span[@ng-show=\"creditoconsumoForm.dateFechaNacimiento.$error.required\" and @class=\"ng-binding\" ]")

    private WebElement birthdate;

    //@FindBy(xpath = "//span[@ng-show=\"(creditoconsumoForm.comboTipoTasa.$viewValue=='' || creditoconsumoForm.comboTipoTasa.$viewValue.label=='' || creditoconsumoForm.comboTipoTasa.$viewValue===undefined) \"]")
    @FindBy(xpath = "//*[@id=\"sim-detail\"]/form/div[4]/select")
    private WebElement valuation;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a")
    private WebElement selectDate;

    public void changePage(){
        for (String winHandle : myDriver.getWindowHandles()) {
            myDriver.switchTo().window(winHandle);
        }
    }
    public String getTextFirstField(){
        return aboutSimulate.getText().toString();
    }

    public String getTextBirthdate(){
        return birthdate.getText().toString();
    }

    public String getTextThirdField(){
        return valuation.getText().toString();
    }

    public void setTextFirstField(String valueOne){
        aboutSimulate.click();
        Select opt = new Select(aboutSimulate);
        opt.selectByVisibleText(valueOne);
    }

    public void setTextTwoField(String valueTwo){
        birthdate.click();
        birthdate.click();
        //selectDate.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setTextThreeField(String valueThree){
        valuation.click();
        Select opt = new Select(valuation);
        opt.selectByVisibleText(valueThree);
    }

    }


