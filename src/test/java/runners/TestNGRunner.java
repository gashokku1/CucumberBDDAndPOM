package runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "src//test//resources//features//ConduitCRUD.feature",		

glue = {"stepDefs"},
monochrome = true,
dryRun = false,
plugin= {"pretty",
"html:target//Reports//HtmlReport.html"
}

)
public class TestNGRunner extends  AbstractTestNGCucumberTests  {
	
  
}
