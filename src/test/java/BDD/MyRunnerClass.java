package BDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//generate cucumber html Report
@CucumberOptions(plugin= {"pretty","html:target/CucumberReport.html"})
public class MyRunnerClass {

}
