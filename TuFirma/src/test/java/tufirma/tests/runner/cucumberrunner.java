package tufirma.tests.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"tufirma.tests.stepDefinitions", "tufirma.tests.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class cucumberrunner extends AbstractTestNGCucumberTests {
}

