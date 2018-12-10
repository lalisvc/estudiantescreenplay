package co.com.bancolombia.certificacion.lineabasescreenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.lineabasescreenplay.userinterface.CapturaDatosUserInterface.*;

public class ValidarInformacion implements Question<String>{


    private String validaciontarea;

    public static ValidarInformacion taskList(){
        return new ValidarInformacion();
    }


    @Override
    public String  answeredBy(Actor lalis) {
        String capturartarea=TEXT_CAPTURADATOS.resolveFor(lalis).getText();
        return capturartarea;
    }


    }


