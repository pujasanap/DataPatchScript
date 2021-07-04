package stepDef;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Utility;


public class ProjectDetailStepDef {

	private static WebDriver driver;

	public ProjectDetailStepDef() {
		this.driver = Hook.getDriver();
	}

	@Given("^clear the project name from serach box$")
	public void clear_the_project_name_from_serach_box() throws Throwable {
		Thread.sleep(1000);
		
			driver.findElement(By.xpath("//input[@type='search']")).clear();
		
	}

	@When("^Click on project to go project details page$")
	public void click_on_project_to_go_project_details_page() throws Throwable {
		driver.navigate().refresh();
		new WebDriverWait(driver, 2000).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("(//a/p[normalize-space()='Gradle-Scopes'])[2]")));
		driver.findElement(By.xpath("(//a/p[normalize-space()='Gradle-Scopes'])[2]")).click();
		WebElement lastelement = driver.findElement(By.xpath("//h4[text()='Scan History']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",lastelement);

	}
	
	@When("^Click on project to go project details$")
	public void click_on_project_to_go_project_details() throws Throwable {
		driver.navigate().refresh();
		new WebDriverWait(driver, 2000).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("(//a/p[normalize-space()='openssl'])[2]")));
		driver.findElement(By.xpath("(//a/p[normalize-space()='openssl'])[2]")).click();
		WebElement lastelement = driver.findElement(By.xpath("//h4[text()='Scan History']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",lastelement);

	}

	@Then("^validate project details page$")
	public void validate_project_details_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='navigation']")));

		String breadcrumb = driver.findElement(By.xpath("//div[@role='navigation']")).getText();
//	    if(breadcrumb != null) {
//	    String projectname = breadcrumb.substring(10,35);
//	    System.out.println("Project Name:-"+projectname);
//	    }else {
//	    	Thread.sleep(1000);
//	    }

		String pageTitle = driver.findElement(By.xpath("//a[text()='Project details']")).getText();
		Assert.assertEquals(pageTitle, "Project details");

	}
	
	@When("^read the data from column$")
	public void read_the_data_from_column() throws Throwable {
		Thread.sleep(2000);
	   WebElement compCountfirstRow = driver.findElement(By.xpath("(//tr[@class='el-table__row']/td[10])[1]"));
	   WebElement compCountsecondRow = driver.findElement(By.xpath("(//tr[@class='el-table__row el-table__row--striped']/td[10])[1]"));
	   WebElement vulCountfirstRow = driver.findElement(By.xpath("(//tr[@class='el-table__row el-table__row--striped']/td[11])[1]"));
	   WebElement vulCountsecondRow = driver.findElement(By.xpath("(//tr[@class='el-table__row']/td[11])[1]"));
	   Assert.assertEquals(compCountfirstRow.getText(), compCountsecondRow.getText());
	   Assert.assertEquals(vulCountfirstRow.getText(), vulCountsecondRow.getText());

	}	
	
}