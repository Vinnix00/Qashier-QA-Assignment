import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        try{
            //Login
            //Input your username and password
            Login login = new Login(driver);
            login.login("YOUR EMAIL", "YOUR PASSWORD");

            //Add new staff
            //Input staff name, staff hourly rate (at most 2 dp), and staff PIN (4 digits)
            AddStaff addStaff = new AddStaff(driver);
            addStaff.addStaff("Abu", "10.55","1177");

            //Edit staff
            //Input staff information that need to be edited, else leave it as empty string
            EditStaff editStaff = new EditStaff(driver);
            editStaff.editStaff("Mohd Abu","24.90", "", "");

            //Delete staffgit
            //Input staff PIN for staff that need to be deleted
            DeleteStaff deleteStaff = new DeleteStaff(driver);
            deleteStaff.deleteStaff("1177");

            //Logout
            Logout logout = new Logout(driver);
            logout.logout();
        } catch (InterruptedException e){
           e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}
