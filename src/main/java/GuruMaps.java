import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class GuruMaps {
	public static WebDriver driver;
	@Given("Launch the browser with url and click addmember option")
	public void launch_the_browser_with_url_and_click_addmember_option() {
		System.setProperty("webdriver.chrome.driver", "D:\\gow\\CucumberProgram\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("The user enter the details by using maps")
	public void the_user_enter_the_details_by_using_maps(DataTable dataTable) {
		List<Map<String, String>> as = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//label[@for=\"done\"]")).click();
		   driver.findElement(By.id("fname")).sendKeys(as.get(1).get("firstname"));
		   driver.findElement(By.id("lname")).sendKeys(as.get(1).get("lastname"));
		   driver.findElement(By.id("email")).sendKeys(as.get(1).get("mail"));
		   driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(as.get(1).get("add"));
		   driver.findElement(By.id("telephoneno")).sendKeys(as.get(1).get("no"));
		   
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	    
	

	@Then("The user can see the confirmation code using maps")
	public void the_user_can_see_the_confirmation_code_using_maps() {
		String txt = driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']")).getText();
		 if(txt.equals("Please Note Down Your CustomerID")) {
			 System.out.println("success");
			 driver.quit();
	}


}}
