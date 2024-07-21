import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditStaff {
    private WebDriver driver;

    public EditStaff(WebDriver driver){
        this.driver = driver;
    }

    public void editStaff(String name, String hourlyRate, String pinNumber, String displayOrder) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        boolean success = false;

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement staffManagementDropdown = driver.findElement(By.xpath("//div[5]/div/div/div/div[3]/div"));
            staffManagementDropdown.click();
            WebElement staffManagementButton = driver.findElement(By.xpath("//div[5]/div/div/div[2]/div/a/div[3]/div/div"));
            staffManagementButton.click();
            WebElement searchStaff = driver.findElement(By.xpath("//label/div/div/div/input"));
            searchStaff.sendKeys(pinNumber + Keys.ENTER);
            WebElement staffPINList = driver.findElement(By.xpath("//td[3]"));
            staffPINList.click();

            if (!name.isEmpty()) {
                WebElement staffName = driver.findElement(By.xpath("//form/div/div/label/div/div/div/input"));
                staffName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
                staffName.sendKeys(name);
                Thread.sleep(2000);
            }

            if (!hourlyRate.isEmpty()) {
                WebElement staffHourlyRate = driver.findElement(By.xpath("//label[2]/div/div/div/input"));
                staffHourlyRate.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
                staffHourlyRate.sendKeys(hourlyRate);
                Thread.sleep(2000);
            }

            if (!pinNumber.isEmpty()) {
                WebElement staffPIN = driver.findElement(By.xpath("//label[3]/div/div/div/input"));
                staffPIN.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
                staffPIN.sendKeys(pinNumber);
                Thread.sleep(2000);
            }

            if (!displayOrder.isEmpty()) {
                WebElement staffDisplayOrder = driver.findElement(By.xpath("//label[4]/div/div/div/input"));
                staffDisplayOrder.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
                staffDisplayOrder.sendKeys(displayOrder);
                Thread.sleep(2000);
            }

            WebElement confirmButton = driver.findElement(By.xpath("//form/div[2]/button[2]"));
            confirmButton.click();
            Thread.sleep(2000);
            success = true;
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            Logs.logs("Edit Staff", startTime, success);
        }
    }
}
