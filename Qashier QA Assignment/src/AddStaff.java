import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddStaff {
    private WebDriver driver;

    public AddStaff(WebDriver driver){
        this.driver = driver;
    }

    public void addStaff(String name, String hourlyRate, String pinNumber) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        boolean success = false;

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement staffManagementDropdown = driver.findElement(By.xpath("//div[5]/div/div/div/div[3]/div"));
            staffManagementDropdown.click();
            WebElement staffManagementButton = driver.findElement(By.xpath("//div[5]/div/div/div[2]/div/a/div[3]/div/div"));
            staffManagementButton.click();
            WebElement addStaffButton = driver.findElement(By.xpath("//div[4]/div/div[2]/button"));
            WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addStaffButton));
            addButton.click();
            WebElement staffName = driver.findElement(By.xpath("//form/div/div/label/div/div/div/input"));
            WebElement staffHourlyRate = driver.findElement(By.xpath("//label[2]/div/div/div/input"));
            WebElement staffPIN = driver.findElement(By.xpath("//label[3]/div/div/div/input"));
            staffName.sendKeys(name);
            Thread.sleep(2000);
            staffHourlyRate.sendKeys(hourlyRate);
            Thread.sleep(2000);
            staffPIN.sendKeys(pinNumber);
            Thread.sleep(2000);
            WebElement confirmButton = driver.findElement(By.xpath("//form/div[2]/button/span[2]/span"));
            confirmButton.click();
            Thread.sleep(2000);
            success = true;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            Logs.logs("Add Staff", startTime, success);
        }
    }
}
