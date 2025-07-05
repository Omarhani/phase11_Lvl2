package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailField = By.cssSelector("[data-qa='login-email']");

    private final By passwordField = By.cssSelector("[data-qa='login-password']");


    public void insertEmail(String email){
        sendKeys(emailField,4,email);
    }
    public void insertPassword(String password){
        sendKeys(passwordField,4,password);
    }
}
