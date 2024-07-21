import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteStaff {
    private WebDriver driver;

    public DeleteStaff(WebDriver driver){
        this.driver = driver;
    }
    public void deleteStaff(String pinNumber) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        boolean success = false;

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement staffManagementDropdown = driver.findElement(By.xpath("//div[5]/div/div/div/div[3]/div"));
            staffManagementDropdown.click();
            ;
            WebElement staffManagementButton = driver.findElement(By.xpath("//div[5]/div/div/div[2]/div/a/div[3]/div/div"));
            staffManagementButton.click();
            WebElement searchStaff = driver.findElement(By.xpath("//label/div/div/div/input"));
            searchStaff.sendKeys(pinNumber + Keys.ENTER);
            WebElement staffPIN = driver.findElement(By.xpath("//td[3]"));
            Thread.sleep(2000);
            staffPIN.click();
            WebElement deleteButton = driver.findElement(By.xpath("//form/div[2]/button"));
            Thread.sleep(2000);
            deleteButton.click();
            WebElement confirmButton = driver.findElement(By.xpath("//div[3]/button[2]"));
            Thread.sleep(2000);
            confirmButton.click();
            Thread.sleep(2000);
            success = true;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            Logs.logs("Delete Staff", startTime, success);
        }
    }
}
