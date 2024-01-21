package Step_Def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step_Definition {
    //    public WebDriver driver;
//    @Given("I open the browser and enter the url")
//    public void i_open_the_browser_and_enter_the_url() throws InterruptedException
//    {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.facebook.com");
//        Thread.sleep(2000);
//    }
//    @When("I will enter the un and pwd click on login btn")
//    public void i_will_enter_the_un_and_pwd_click_on_login_btn()
//    {
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Abc");
//        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
//        driver.findElement(By.xpath("//button[@name='login']")).click();
//    }
//    @Then("Check for homepage")
//    public void check_for_homepage()
//    {
//        String AT="Log in to Facebook";
//        String ET=driver.getTitle();
//        Assert.assertEquals(AT,ET);
//    }
//    @Then("Close the browser")
//    public void close_the_browser() throws InterruptedException
//    {
//        Thread.sleep(3000);
//        driver.close();
//    }
    public WebDriver driver;

    @Given("I open the browser and enter the url")
    public void i_open_the_browser_and_enter_the_url()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Thread.sleep(2000);
    }

    @When("i will enter the un and pwd click on login btn")
    public void i_will_enter_the_un_and_pwd_click_on_login_btn()
    {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Abc");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
        driver.findElement(By.xpath("//button[@name='login']")).click();
//        Thread.sleep(2000);
    }

    @Then("check for homepage")
    public void check_for_homepage()
    {
        String AT="Log in to Facebook";
        String ET=driver.getTitle();
        Assert.assertEquals(AT,ET);
//        Thread.sleep(2000);
    }

    @Then("close the browser")
    public void close_the_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
