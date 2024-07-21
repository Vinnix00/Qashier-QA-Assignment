import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private WebDriver driver;
    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void login(String username, String password) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        boolean success = false;
        try {
            driver.get("https://hq.qashier.com/#/login");

            WebElement usernameField = driver.findElement(By.xpath("//div[@id='q-app']/div/div/main/div/form/label/div/div/div/input"));
            WebElement passwordField = driver.findElement(By.xpath("//div[@id='q-app']/div/div/main/div/form/label[2]/div/div/div/input"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            usernameField.sendKeys(username);
            Thread.sleep(2000);
            passwordField.sendKeys(password);
            Thread.sleep(2000);
            loginButton.click();
            success = true;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            Logs.logs("Login", startTime, success);
        }
    }
}
