package co.com.bancolombia.certificacion.lineabasescreenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static org.openqa.selenium.Keys.*;

public class AdicionarTareaUserInterface {

    public static final Target TEXT_ADICIONARTAREA =Target.the("tarea")
            .located(By.id(("uniqName_0_0")));

}
