package nl.tudelft.jpacman.e2e.framework.startup;

import org.junit.runner.RunWith;
import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.junit.platform.engine.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "nl.tudelft.jpacman.e2e.framework.startup"
)
public class StartupTest {
    // No additional code needed here; Cucumber runner picks up feature files
}

