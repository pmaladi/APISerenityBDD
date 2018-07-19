package cucumberTest;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		format={"pretty","json:target/"},
		features= "src/Feature/Sample.feature")
/*


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(format = {"pretty"}, monochrome=true, features = "src/Feature/Sample.feature")
*/

public class TestRunner {
 
}