package TestRunner;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="\\src\\test\\java\\Feature\\.feature");
glue = {"TestRunner"},
monochrome=true,
plugin= {"pretty","html:target/htmlreports/report.html",
		 "json:target/jsonreports/reports.json",
		 "junit:target/junitreports/report/html"};

public class TestRunner1 {

}
