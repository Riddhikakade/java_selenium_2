package Steps;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"Steps"},
monochrome=true,
//plugin= {"pretty","HTML:target/HtmlReports"},
plugin = { "pretty", "junit:target/reports/cucumber.xml"},
tags="@smoketest"
)
public class Runner {

}

