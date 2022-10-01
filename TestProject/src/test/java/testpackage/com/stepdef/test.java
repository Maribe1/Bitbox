package testpackage.com.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {
    WebDriver driver;

    @Given("i open facebook on {string}")
    public void i_open_facebook_on(String browser) {
        if (browser.toUpperCase().equals("CHROME")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\IdeaProjects\\TestProject\\src\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
        } else if (browser.toUpperCase().equals("EDGE")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\User1\\IdeaProjects\\TestProject\\src\\drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
        }
    }

    @When("i enter username and password")
    public void i_enter_username_and_password() throws InterruptedException {
       driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("makgato");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
    }

    @Then("i land on home page")
    public void i_land_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
