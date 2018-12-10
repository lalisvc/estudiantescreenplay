package co.com.bancolombia.certificacion.lineabasescreenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/translate.feature",
        glue = "co.com.bancolombia.certificacion.lineabasescreenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class EstudianteRunner {
}
