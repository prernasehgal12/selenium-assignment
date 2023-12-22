package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
 
public class RegistrationForm {
 
    public static void main(String[] args) {
       
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PrernaSehgal\\Desktop\\selenium\\seleniumproject\\src\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
 
       
        driver.get("https://demo.guru99.com/test/newtours/register.php");
 
     
        WebElement NameInput = driver.findElement(By.name("firstName"));
        NameInput.sendKeys("Prerna");
 
        WebElement surnameInput = driver.findElement(By.name("lastName"));
        surnameInput.sendKeys("Sehgal");
 
        WebElement mobileInput = driver.findElement(By.name("phone"));
        mobileInput.sendKeys("1234567892");
 
        WebElement mailInput = driver.findElement(By.id("userName"));
        mailInput.sendKeys("prerna@cloudeq.com");
 
        WebElement residentialaddressInput = driver.findElement(By.name("address1"));
        residentialaddressInput.sendKeys("haryana");
 
        WebElement cityInput = driver.findElement(By.name("city"));
        cityInput.sendKeys("chandigarh");
 
        WebElement stateInput = driver.findElement(By.name("state"));
        stateInput.sendKeys("haryana");
 
        WebElement pincodeInput = driver.findElement(By.name("postalCode"));
        pincodeInput.sendKeys("888888");
 
       
        WebElement countryDropdown = driver.findElement(By.name("country"));
        countryDropdown.sendKeys("India");
 
     
        WebElement gmailInput = driver.findElement(By.id("email"));
        gmailInput.sendKeys("prernasehgal@gmailcom");
 
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("888888");
 
        WebElement confirmPasswordInput = driver.findElement(By.name("confirmPassword"));
        confirmPasswordInput.sendKeys("888888");
 
       
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
 
       
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
 
