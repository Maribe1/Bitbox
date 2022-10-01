package testpackage.com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"},
        features = "C:\\Users\\User1\\IdeaProjects\\TestProject\\src\\test\\java\\testpackage\\com\\feature\\test.feature",
        glue = {"testpackage.com.stepdef"},
        tags = "@all"
)
public class Runner {

}
