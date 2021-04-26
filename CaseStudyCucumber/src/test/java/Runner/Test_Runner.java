package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login/Login.feature"},glue ="StudyDefintion",
dryRun=false,strict = true,
plugin = {"html:testoutput/testoutputHtmlReport.html","junit:testoutput/report.xml","junit:testoutput/report.json"}
)
public class Test_Runner { 

}

