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

public class PayBILLS {
    public WebDriver driver;
    @Given("^I click sign in$")
    public void iClickSignIn() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Drivers\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://zero.webappsecurity.com/");
        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.ClickHomePageSignIN();

    }

    @And("^I give right user name$")
    public void iGiveRightUserName() {
        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.EnterUsername();
    }

    @And("^I input right password$")
    public void iInputRightPassword() {
        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.EnterPassword();
    }

    @When("^I click on log in$")
    public void iClickOnLogIn() throws InterruptedException {
        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.SignIn();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @And("^I click on Pay bills button$")
    public void iClickOnPayBillsButton() {
        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.ClickTransferLink();
        page.ClickOnPayBillsButton();
        page.SelectFromPayee();
        page.SelectFromAccountPayee();
        page.EnterAmountPayee();
        page.EnterDatePayee();

    }

    @Then("^i should pay bills successfully$")
    public void iShouldPayBillsSuccessfully() {
        ZeroBankPage page = PageFactory.initElements(driver, ZeroBankPage.class);
        page.ClickOnPayLink();
        driver.quit();
    }
}
