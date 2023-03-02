package Step_definition;

import Pages.ZeroBankPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsAndPayment {
    public WebDriver driver;
    @Given("^I click on sign in$")
    public void iClickOnSignIn() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Drivers\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://zero.webappsecurity.com/");

        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.ClickHomePageSignIN();
    }

    @And("^I enter correct username$")
    public void iEnterCorrectUsername() {
        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.EnterUsername();
    }

    @And("^I enter correct password$")
    public void iEnterCorrectPassword() {
        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.EnterPassword();
    }

    @When("^I should sign in$")
    public void iShouldSignIn() throws InterruptedException {

        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.SignIn();
        Thread.sleep(2000);
    driver.navigate().back();
    }

    @And("^I click on Transfer funds link$")
    public void iClickOnTransferFundsLink() {
        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.ClickTransferLink();
        page.SelectFromAcct();
        page.SelectToAcct();
        page.EnterAmount();
        page.EnterDescription();
    }

    @Then("^I should transfer money successfully$")
    public void iShouldTransferMoneySuccessfully() {
        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.ContiunePayment();
        page.SubmitPayment();
        driver.quit();
    }
}
