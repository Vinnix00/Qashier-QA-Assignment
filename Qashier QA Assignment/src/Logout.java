import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Logout {
    private WebDriver driver;

    public Logout(WebDriver driver){
        this.driver = driver;
    }

    public void logout() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        boolean success = false;

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement usernameDropdownButton = driver.findElement(By.xpath("//button[2]/span[2]/i"));
            usernameDropdownButton.click();
            Thread.sleep(2000);
            WebElement logoutButton = driver.findElement(By.xpath("//div[7]/div[2]/div"));
            logoutButton.click();
            success = true;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            Logs.logs("Logout", startTime, success);
        }

    }
}
