import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jov on 05/10/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, plugin = {"pretty", "json:build/reports/cucumber.json", "html:build/reports/"},
        features = "classpath:features"
)
public class RunCukesTest {

}
