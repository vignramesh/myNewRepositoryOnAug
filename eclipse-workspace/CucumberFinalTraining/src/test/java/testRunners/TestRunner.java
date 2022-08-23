package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile.feature", 
glue = {"stepDefenitions", "Hooks"}, monochrome=true)
public class TestRunner {

}
