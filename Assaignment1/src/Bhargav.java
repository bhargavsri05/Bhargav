import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import ObjRep.Google;
 
 
public class Bhargav {
       public static WebDriver driver;
       public static void main(String[] args) throws InterruptedException {
              driver = new FirefoxDriver();                                                                          //Firefox Browser Initiated
              driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
              driver.get("https://www.google.co.uk/");                                                 //Opening URL
              driver.manage().window().maximize();                                                            //Maximizing browser
             
              driver.findElement(Google.GmailLink).click();                                            //Clicking on Gmail
              Thread.sleep(3000);                                                                       
               driver.findElement(Google.CreateAccount).click();
              driver.findElement(Google.FirstName).sendKeys("gsdfgdfg");
              driver.findElement(Google.LastName).sendKeys("sdfesfsd");
              driver.findElement(Google.Password1).sendKeys("Bhargavtest");
              driver.findElement(Google.PasswordAgain).sendKeys("Bhargavtest");
              driver.findElement(Google.BirthMonth).click();
              Thread.sleep(1000);
              driver.findElement(Google.Month).click();
              driver.findElement(Google.Date).sendKeys("23");
              driver.findElement(Google.Year).sendKeys("1986");
              driver.findElement(Google.Gender).click();
              Thread.sleep(1000);
              driver.findElement(Google.Male).click();
              driver.findElement(Google.Phone).sendKeys("9962246462");
              driver.findElement(Google.SkipCaptcha).click();
              driver.findElement(Google.Terms).click();
              driver.findElement(Google.Submit).click();
              String ErrorMessage = driver.findElement(Google.ErrorMessage).getText();
              if(ErrorMessage.equals("You can't leave this empty."))
                     {
                           System.out.println("Error message dispplayed is correct");
                          
                     }
                     else
                     {
                           System.out.println("Error message displayed is Incorrect");
                     }
             
              driver.quit();
             
}
}
 

