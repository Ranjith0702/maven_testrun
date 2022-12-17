package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/cuctest"},
        glue = "steps",
        tags = "@first",
        plugin = {"html:target/cucumber-reports" },
//        dryRun = false,
        monochrome = true
)

public class testngrunner extends AbstractTestNGCucumberTests{

}