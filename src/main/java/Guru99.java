import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Guru99 {
	public static WebDriver driver;
	@Given("The user launch the browser with url")
	public void the_user_launch_the_browser_with_url() {
		System.setProperty("webdriver.chrome.driver", "D:\\gow\\CucumberProgram\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
		
	}

	@When("The user enter the details")
	public void the_user_enter_the_details(DataTable dataTable) {
		
	List<List<String>> as = dataTable.asLists();
		driver.findElement(By.xpath("//label[@for=\"done\"]")).click();
		   driver.findElement(By.id("fname")).sendKeys(as.get(1).get(0));
		   driver.findElement(By.id("lname")).sendKeys(as.get(1).get(1));
		   driver.findElement(By.id("email")).sendKeys(as.get(1).get(2));
		   driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(as.get(1).get(3));
		   driver.findElement(By.id("telephoneno")).sendKeys(as.get(1).get(4));
		   
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("The user can see the confirmation code")
	public void the_user_can_see_the_confirmation_code() {
		 String txt = driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']")).getText();
		 if(txt.equals("Please Note Down Your CustomerID")) {
			 System.out.println("success");
			 driver.quit();
	   
	}

	}
}
