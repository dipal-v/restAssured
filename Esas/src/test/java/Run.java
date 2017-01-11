import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Dipal Vyas on 10/07/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions
        (

                format = {"html:target/cucumber","json:target/cucumber-report.json"},
                features = {"src/test"}                                          ,
                tags = {"@dipal"}
                

        )


public class Run {

}
