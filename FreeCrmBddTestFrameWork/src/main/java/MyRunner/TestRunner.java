package MyRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\developing\\java\\selenium\\practice\\FreeCrmBddTestFrameWork\\src\\main\\java\\Features\\login.feature",
		glue= {"stepDefination"},
		format= {"pretty", "html:test-output"}
		)
		
public class TestRunner {
	

}
