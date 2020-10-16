package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefination {
	WebDriver driver;
	
	
	@Given("^user is on Landing Page$")
	public void landingPage_check() {
		System.setProperty("webdriver.chrome.driver", "E:\\developing\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
	}
	
	@When("^logo of Landing Page have YOUR BUSINESS CLOUD PARTNER$")
	public void logo_of_Landing_Page_have_YOUR_BUSINESS_CLOUD_PARTNER() throws Throwable {
	    WebElement slogan = driver.findElement(By.xpath("//div[@class='rd-navbar-brand']/a[@class='brand-name'and@title='free crm home']/span[@class='brand-slogan']"));
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(slogan));
		String actualSlogan = slogan.getText();
		System.out.println(actualSlogan);
		Assert.assertEquals("YOUR BUSINESS CLOUD PARTNER", actualSlogan);
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	   driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	}
	
	@When("^login button is visible$")
	public void login_button_is_visible() throws Throwable {
	    WebElement logButton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(logButton));
	    Assert.assertEquals("Login", logButton.getText());
	}
	
	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
	    driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("peddisiva1@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Siva7482");
	}
	
	@Then("^user clicks on login buttton$")
	public void user_clicks_on_login_buttton() throws Throwable {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}
	
	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
//		driver.getTitle().wait();
	    String name =driver.getTitle();
	    System.out.println(name);
	    Assert.assertEquals("Cogmento CRM", name);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable{
		driver.quit();
	}

}
