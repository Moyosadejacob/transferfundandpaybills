package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TransferFundsPage {
    public WebDriver driver;
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Drivers\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://zero.webappsecurity.com/");
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        driver.findElement(By.id("signin_button")).click();
    }

    @When("^I Input correct username$")
    public void iInputCorrectUsername() {
        driver.findElement(By.name("user_login")).sendKeys("username");
    }

    @And("^I enter valid password$")
    public void iEnterValidPassword() {
        driver.findElement(By.id("user_password")).sendKeys("password");
    }

    @When("^I click on sign button$")
    public void iClickOnSignButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/input")).click();
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @And("^I click on Transfer Funds button$")
    public void iClickOnTransferFundsButton() {
        driver.findElement(By.xpath("//*[@id=\"transfer_funds_link\"]")).click();
    }

    @Then("^I should be in Transfer Funds page$")
    public void iShouldBeInTransferFundsPage() {
        String ExpectedLogInUser = "Transfer Money & Make Payments";
        String ActualLogInUser = driver.findElement(By.xpath("//*[@id=\"transfer_funds_content\"]/form/div/div/h2")).getText();
        Assert.assertEquals(ExpectedLogInUser, ActualLogInUser);
        System.out.println(ActualLogInUser);
        driver.quit();
    }
}
