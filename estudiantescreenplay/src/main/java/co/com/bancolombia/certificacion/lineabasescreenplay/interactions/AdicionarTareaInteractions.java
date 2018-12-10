package co.com.bancolombia.certificacion.lineabasescreenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.bancolombia.certificacion.lineabasescreenplay.userinterface.AdicionarTareaUserInterface.TEXT_ADICIONARTAREA;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AdicionarTareaInteractions implements Interaction {

    private String tarea;

    public AdicionarTareaInteractions(String tarea) {
        this.tarea = tarea;
    }


    @Override
    public <T extends Actor> void performAs(T lalis) {
        lalis.attemptsTo(Enter.theValue(tarea) .into(TEXT_ADICIONARTAREA).thenHit(Keys.ENTER));

    }

 public static AdicionarTareaInteractions adicionarTarea(String tarea){
        return instrumented(AdicionarTareaInteractions.class, tarea);
 }

}
