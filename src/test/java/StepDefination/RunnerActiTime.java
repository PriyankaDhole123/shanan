package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\eclipse-workspace\\cucumber1\\FeaturesPractice\\LoginActi.feature",glue = {"StepDefination"},plugin = {"pretty","html:target\\report11.html"})
public class RunnerActiTime {
	

}
