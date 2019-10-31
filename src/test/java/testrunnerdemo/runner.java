package testrunnerdemo;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\n.e.mishra\\workspace\\test\\src\\test\\java"
,glue={"stepdefdemo"
},plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
		monochrome = true ) 


public class runner {


}
