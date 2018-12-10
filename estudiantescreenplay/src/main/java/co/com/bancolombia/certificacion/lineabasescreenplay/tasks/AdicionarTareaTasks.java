package co.com.bancolombia.certificacion.lineabasescreenplay.tasks;


import co.com.bancolombia.certificacion.lineabasescreenplay.interactions.AdicionarTareaInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.lineabasescreenplay.userinterface.AdicionarTareaUserInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AdicionarTareaTasks implements Task {

    private String tarea;

    public AdicionarTareaTasks(String tarea) {
        this.tarea = tarea;
    }


    @Override
    public <T extends Actor> void performAs(T lalis) {
        lalis.attemptsTo(Click.on(TEXT_ADICIONARTAREA),
                AdicionarTareaInteractions.adicionarTarea(tarea));

    }


    public static AdicionarTareaTasks adicionarTarea(String tarea){
        return instrumented(AdicionarTareaTasks.class, tarea);


    }
}
