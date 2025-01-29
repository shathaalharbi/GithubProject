package ObjectPath;

import org.openqa.selenium.By;

public class GithubPaths {
    public static final By signIn = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");


    public static final By signUp = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/a");

    public static final By TermsOfService = By.xpath("//a[contains(text(), 'Terms of Service')]");

    public static final By PrivacyStatement = By.xpath("//a[contains(text(), 'GitHub Privacy Statement')]");


}
