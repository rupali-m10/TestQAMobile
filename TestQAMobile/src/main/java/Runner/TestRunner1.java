package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"C:\\Users\\MY LAPPY HOUSE\\IdeaProjects\\TestQA\\src\\main\\java\\FeatureFiles"},
        glue = {"StepDefinitionFile",
                "Support",
        "Pages"},
        monochrome = true,
        dryRun = false,
        tags= "@Runtest",
        plugin = {
                "json:build/cucumber-reports/cucumber.json",
                "rerun:build/cucumber-reports/rerun.txt"
        })

public class TestRunner1 extends AbstractTestNGCucumberTests
{
}


