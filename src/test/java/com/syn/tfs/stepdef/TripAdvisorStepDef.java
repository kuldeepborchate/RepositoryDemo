package com.syn.tfs.stepdef;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.syn.tfs.Repository.LoggerRepo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TripAdvisorStepDef 
{
	WebDriver driver;
	WebDriverWait wait;
	String className=String.class.getName();
	Logger log;
	
	
	@When("^files setup done$")
	public void files_setup_done() throws Throwable {
		LoggerRepo.setLogger(className);
		log=LoggerRepo.getLogger();
	}
	
	@Given("^Open browser and maximize it$")
	public void open_browser_and_maximize_it() throws Throwable {
		driver=new FirefoxDriver();
		log.info("Browser Opened successfully...!");
		//driver.setJavascriptEnabled(true);
		driver.manage().window().maximize();
		log.info("Browser maximised successfully...!");
	}
	
	@When("^navigate to https://care\\.ideacellular\\.com/wps/portal/account/account-login$")
	public void navigate_to_https_care_ideacellular_com_wps_portal_account_account_login() throws Throwable {
		driver.get("https://care.ideacellular.com/wps/portal/account/account-login");
		log.info("Tiltel printed title is " +driver.getTitle());
	}

	@Then("^enter uname and password$")
	public void enter_uname_and_password() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ns_Z7_JH56H4K0K0NI90AS8HP1UF00I1_mobileNumber")).sendKeys("8055445001");
		System.out.println("User Name entred");
		log.info("value entred as ->"+driver.findElement(By.cssSelector("#ns_Z7_JH56H4K0K0NI90AS8HP1UF00I1_mobileNumber")).getText());

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ns_Z7_JH56H4K0K0NI90AS8HP1UF00I1_password")).sendKeys("Lordmahadev@1");
		System.out.println("Password entred");
		log.info("Password entred.......!");
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ns_Z7_JH56H4K0K0NI90AS8HP1UF00I1_loginButton")).click();
		System.out.println("Clicked on login button");
		log.info("clicked on login button.....!");
	}

	@Then("^click on Pay button$")
	public void click_on_Pay_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ns_Z7_HGC2H3C0K8P000A4R29DSQ10Q3_quickButton")).click();
		System.out.println("Clicked on Pay button");
		log.info("clicked on Pay button.....!");
		
	}

	@Then("^enter amt to be paid$")
	public void enter_amt_to_be_paid() throws Throwable {
		Thread.sleep(7000);
		String outstandingAmt=driver.findElement(By.cssSelector("table.tablePrepaid>tbody>tr:nth-child(2)>td:nth-child(2)>input")).getAttribute("value");
		driver.findElement(By.cssSelector("tbody>tr:nth-child(3)>td:nth-child(2)>input[name='amountPaid']")).sendKeys(String.valueOf(Float.valueOf(outstandingAmt)+100));
		log.info("Amount to be paid is entred is -> "+driver.findElement(By.cssSelector("tbody>tr:nth-child(3)>td:nth-child(2)>input[name='amountPaid']")).getText());
	}

	@Then("^choose cards and net-banking option$")
	public void choose_cards_and_net_banking_option() throws Throwable {
		driver.findElement(By.cssSelector("table.tablePrepaid>tbody>tr:nth-child(5)>td:nth-child(2)>div>div>input[name='paymentGayway']")).click();
		System.out.println("Enabled net banking option");
		log.info("clicked on radio button.....!");
		Thread.sleep(3000);
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		driver.findElement(By.cssSelector("table.tablePrepaid>tbody>tr:nth-child(8)>td>input[value='Submit']")).click();
		Thread.sleep(3000);
		log.info("clicked on submit button.....!");

		driver.findElement(By.cssSelector("div.add_new>div.frm>input[value='Confirm']")).click();
		log.info("clicked on confirm button.....!");
		System.out.println("Clicked on confirm button");
	}
}