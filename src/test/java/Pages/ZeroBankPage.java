package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ZeroBankPage {

    public int random;
    public WebDriver driver;
    @FindBy(how = How.ID, using = "signin_button")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using = "user_login")
    public static WebElement UserLogIn;

    @FindBy(how = How.ID_OR_NAME, using = "user_password")
    public static WebElement UserPassword;

    @FindBy(how = How.NAME, using = "submit")
    public static WebElement ClickToSignIn;

    @FindBy(how = How.ID, using = "transfer_funds_link")
    public static WebElement TransferFudsLink;

    @FindBy(how = How.ID_OR_NAME, using = "fromAccountId")
    public static WebElement FromAccountId;

    @FindBy(how = How.ID_OR_NAME, using = "toAccountId")
    public static WebElement ToAccountId;

    @FindBy(how = How.ID_OR_NAME, using = "amount")
    public static WebElement TransferAmount;

    @FindBy(how = How.ID_OR_NAME, using = "description")
    public static WebElement TransferDescription;

    @FindBy(how = How.ID, using = "btn_submit")
    public static WebElement ContiuneTransfer;

    @FindBy(how = How.ID, using = "btn_submit")
    public static WebElement SubmitTransfer;

    @FindBy(how=How.ID,using = "pay_bills_tab")
    public static WebElement ClickPayBillsLink;

    @FindBy(how = How.ID_OR_NAME, using = "sp_payee")
    public static WebElement PayeeAccountName;

    @FindBy(how = How.ID_OR_NAME, using = "sp_account")
    public static WebElement Account_Payee;

    @FindBy(how = How.ID_OR_NAME, using = "sp_amount")
    public static WebElement Amount_Payee;

    @FindBy(how = How.ID_OR_NAME, using = "sp_date")
    public static WebElement DateOfPayee;

    @FindBy(how = How.ID, using = "pay_saved_payees")
    public static WebElement ClickonPay;

    public void  ClickHomePageSignIN(){
        SignInLink.click();
    }

    public void EnterUsername() {
        UserLogIn.sendKeys("username");
    }

    public void EnterPassword() {
        UserPassword.sendKeys("password");


    }

    public void SignIn() {
        ClickToSignIn.click();
      //  driver.navigate().back();


    }

    public void ClickTransferLink() {
        TransferFudsLink.click();


    }

    public void SelectFromAcct(){
        Select fromaccount = new Select(FromAccountId);
        fromaccount.selectByValue("4");

    }

    public void SelectToAcct(){
        Select toaccount = new Select(ToAccountId);
        toaccount.selectByValue("2");

    }

    public void EnterAmount() {
        TransferAmount.sendKeys("240");


    }

    public void EnterDescription() {
        TransferDescription.sendKeys("for school fees");


    }

    public void ContiunePayment() {
        ContiuneTransfer.click();


    }

    public void SubmitPayment() {
        SubmitTransfer.click();


    }

    public void ClickOnPayBillsButton() {
        ClickPayBillsLink.click();


    }

    public void SelectFromPayee(){
        Select Payee = new Select(PayeeAccountName);
        Payee.selectByValue("apple");

    }


    public void SelectFromAccountPayee(){
        Select Acct = new Select(Account_Payee);
        Acct.selectByValue("4");

    }
    public void EnterAmountPayee() {
        Amount_Payee.sendKeys("34");

    }

    public void EnterDatePayee() {
        DateOfPayee.sendKeys("2022-10-28");

    }

    public void ClickOnPayLink() {
        ClickonPay.click();


    }
}
