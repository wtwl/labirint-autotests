package labirinth.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    By regionButton = By.cssSelector(".js-header-menu-region-name");
    By regionModal = By.cssSelector("#change-region-content");

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.of(10, ChronoUnit.SECONDS));
    }

    public void openRegionModal() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(regionButton)));
        element.click();

        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(regionModal));
    }
}
