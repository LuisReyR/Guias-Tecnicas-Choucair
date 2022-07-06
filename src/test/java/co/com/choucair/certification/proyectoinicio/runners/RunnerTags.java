package co.com.choucair.certification.proyectoinicio.runners;

import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/academyChoucair.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.proyectoinicio.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
