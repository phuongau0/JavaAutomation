package cucumbers.stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class LoginTest {

    WebDriver driver;

    @Given("user is on saucedemo login page")
    public void launchURL() throws InterruptedException {
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        System.out.println("launched url");
        Thread.sleep(2000);
    }


  /*public class RandomStringExmple {     
     private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; 
     // a-z     private static final String alphaUpperCase = alpha.toUpperCase(); 
     // A-Z     private static final String digits = "0123456789"; 
     // 0-9     private static final String specials = "~=+%^()[]{}/!@#$?|";     
     private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;     
     private static final String ALL = alpha + alphaUpperCase + digits + specials;     
     private static Random generator = new Random()
     public String randomAlphaNumeric(int numberOfCharactor) 
     {         StringBuilder sb = new StringBuilder();         
     for (int i = 0; i < numberOfCharactor; i++) {            
          int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);             
          char ch = ALPHA_NUMERIC.charAt(number);             
          sb.append(ch);         }         
          return sb.toString();     
          }     /**      * Random string password with at least 1 digit and 1 special character       
           public String randomPassword(int numberOfCharactor) {         
               List<String> result = new ArrayList<>();         
               Consumer<String> appendChar = s -> {            
                    int number = randomNumber(0, s.length() - 1);             
                    result.add("" + s.charAt(number));         };        
                     appendChar.accept(digits);         
                     appendChar.accept(specials);         
                     while (result.size() < numberOfCharactor) {             
                         appendChar.accept(ALL);         }         
                         Collections.shuffle(result, generator);         
                         return String.join("", result);     }     p
                         ublic static int randomNumber(int min, int max) {        
                              return generator.nextInt((max - min) + 1) + min;     }     public static void main(String a[]){         int numberOfCharactor = 8;         RandomStringExmple rand = new RandomStringExmple();             System.out.println("randomString1: " + rand.randomAlphaNumeric(numberOfCharactor));         System.out.println("randomString1: " + rand.randomAlphaNumeric(numberOfCharactor));         System.out.println("randomString1: " + rand.randomAlphaNumeric(numberOfCharactor));     
*/
/*
public void ReadDoc
{
 FileInputStream fin = null;
        try {
            fin = new FileInputStream("./AuTotest/SampleProjSelenium/test.txt");
            int data = fin.read();
            StringBuilder line = new StringBuilder();
            while (data != -1) {
                if (((char) data == '\n') || ((char) data == '\r')) {
                    System.out.println("New line: " + line.toString());
                    line.delete(0, line.length());
                    data = fin.read();
                    continue;
                }
                line.append((char) data);
                data = fin.read();
            }
            System.out.println("New line: " + line.toString());
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
*/
    @When("enter username")
    public void enter_username() {
        // Write code here that turns the phrase above into concrete actions
         WebElement username=driver.findElement(By.name("user-name"));
         username.sendKeys("a");
        //throw new io.cucumber.java.PendingException();
    }

    @When("enter password")
    public void enter_password() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("click on login")
    public void clickOnLogin() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("validate user is on product details page")
    public void validate_user_is_on_product_details_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("^enter username as \"([^\"]*)\"$")
    public void enter_username_as(String userName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(userName);
    }

    @When("^enter password as \"([^\"]*)\"$")
    public void enter_password_as(String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(password);
    }

    @When("^enter username as ([^\"]*)$")
    public void enter_username_as_example(String userName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(userName);
    }

    @When("^enter password as ([^\"]*)$")
    public void enter_password_as_example(String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(password);
    }

    @Then("close the browser")
    public void closeBrowser(){
        //driver.quit();
    }

    @When("enter username & password")
    public void enterUsernamePassword(DataTable table) {
        System.out.println("Datable user & password");

        List<Map<String, String>> data = table.asMaps();
        for(Map<String, String> d:data){
            System.out.println(d.get("username"));
            System.out.println(d.get("password"));
        }

    }
}
