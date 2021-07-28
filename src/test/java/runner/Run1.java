package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Cucumber", glue= "StepDefn")
public class Run1 extends AbstractTestNGCucumberTests{

}
