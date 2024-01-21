package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Intelij_workspace\\Orange_Hrm\\src\\test\\resources\\Feat\\Lo.feature"
        ,glue = "Step_Def")

public class Test_Runner
{

}
