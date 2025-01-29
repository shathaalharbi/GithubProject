
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectPath.GithubPaths.*;
import static ObjectPath.LoginPaths.*;


public class LoginPages {
    WebDriver driver = null;
    public LoginPages(WebDriver driver){
        this.driver=driver;
    }

    public void openGitUrl(){
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn(){
        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();
    }


    public void fillEmail(){
        WebElement Email = driver.findElement(email);
        Email.sendKeys("shatha3456alharbi@gmail.com");
    }

    public void fillPassword(){
        WebElement Email = driver.findElement(password);
        Email.sendKeys("SHa2001121");
    }

    public void ClickOnLogin(){
        WebElement login = driver.findElement(signInBtn);
        login.click();
    }
}