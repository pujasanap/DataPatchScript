package runner;

import java.io.File;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/feature"},
//{"src/test/java/features/01_Register.feature","src/test/java/features/02_Login.feature","src/test/java/features/03_Dashboard.feature","src/test/java/features/04_Project.feature","src/test/java/features/05_ProjectDetails.feature","src/test/java/features/06_Component.feature","src/test/java/features/07_ComponentScanResult.feature"},
	glue = { "stepDef" },tags= {"~@skip","~@binary","~@group","~@upload"}, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
	  public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File("Config/Report.xml"));
}
}