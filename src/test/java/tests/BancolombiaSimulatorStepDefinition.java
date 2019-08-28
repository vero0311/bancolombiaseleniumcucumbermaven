package tests;

import cucumber.api.java.Before;
import cucumber.api.java8.En;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pageobjects.FreeInvestmentCreditHomePage;
import pageobjects.SimulatiorFreeInvestmentCredit;

import static org.junit.Assert.assertEquals;


public class BancolombiaSimulatorStepDefinition implements En {

    private WebDriver myDriver;
    public final static String URL_BANCOLOMBIA_FREE_INVESTMENT_CREDIT = "https://www.grupobancolombia.com/wps/portal/personas/productos-servicios/creditos/consumo/libre-inversion";
    public final static String URL_SIMULATOR_FREE_INVESTMENT = "https://www.grupobancolombia.com/wps/portal/personas/productos-servicios/creditos/consumo/libre-inversion/simulador-credito-consumo";
    FreeInvestmentCreditHomePage freeInvestmentCreditHomePage;
    SimulatiorFreeInvestmentCredit simulatiorFreeInvestmentCredit;

    @Before
    public void setup() {
        System.setProperty("Webdriver.chrome.driver", "chromedriver");
        myDriver = new ChromeDriver();
        freeInvestmentCreditHomePage = new FreeInvestmentCreditHomePage(myDriver);
        simulatiorFreeInvestmentCredit = new SimulatiorFreeInvestmentCredit(myDriver);
    }

    public BancolombiaSimulatorStepDefinition() {

        Given("That I am in Bancolombia free investment credit", () -> {
            myDriver.get(URL_BANCOLOMBIA_FREE_INVESTMENT_CREDIT);


        });

        When("I enter the free investment credit simulator", () -> {
            freeInvestmentCreditHomePage.enterToSimulator();


        });

        Then("I hope to see warning messages, in each field {string}", (String string) -> {
            simulatiorFreeInvestmentCredit.changePage();
            assertEquals(string, simulatiorFreeInvestmentCredit.getTextFirstField());
            assertEquals(string, simulatiorFreeInvestmentCredit.getTextBirthdate());
            assertEquals(string, simulatiorFreeInvestmentCredit.getTextThirdField());

        });

        Given("That I am in Bancolombia free investment credit simulator", () -> {
            myDriver.get(URL_SIMULATOR_FREE_INVESTMENT);
        });

        When("I enter in the field What do you want to simulate {string}, field birthdate {string} and field What type of rate do you want your loan with {string}", (String string, String string2, String string3) -> {
            simulatiorFreeInvestmentCredit.setTextFirstField(string);
            simulatiorFreeInvestmentCredit.setTextTwoField(string2);
            simulatiorFreeInvestmentCredit.setTextThreeField(string3);
        });

        Then("I hope to see warning messages {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });
    }
}
