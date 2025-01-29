package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectPath.GithubPaths.*;

public class GithubPages {
    WebDriver driver = null;
    public GithubPages(WebDriver driver){
        this.driver=driver;
    }

    public void openGitUrl(){
        driver.get("https://github.com/");
    }

    public void clickOnSignUpBtn(){
        WebElement SignUpBtn = driver.findElement(signUp);
        SignUpBtn.click();

    }

    public void clickOnTermsOfService(){
        WebElement TermsOfServiceLink = driver.findElement(TermsOfService);
        TermsOfServiceLink.click();
    }

    public void clickOnPrivacyStatement(){
        WebElement PrivacyStatementLink = driver.findElement(PrivacyStatement);
        PrivacyStatementLink.click();
    }
}
