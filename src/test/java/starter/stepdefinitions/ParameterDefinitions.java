package starter.stepdefinitions; // Define el paquete al que pertenece esta clase

import io.cucumber.java.Before; // Importa la anotación Before de Cucumber
import io.cucumber.java.ParameterType; // Importa la anotación ParameterType de Cucumber
import net.serenitybdd.screenplay.Actor; // Importa la clase Actor de Serenity Screenplay
import net.serenitybdd.screenplay.actors.OnStage; // Importa la clase OnStage de Serenity Screenplay
import net.serenitybdd.screenplay.actors.OnlineCast; // Importa la clase OnlineCast de Serenity Screenplay

public class ParameterDefinitions { // Declara la clase ParameterDefinitions

    @ParameterType(".*") // Anotación que define un parámetro personalizado para mapear a un Actor con un nombre
    public Actor actor(String actorName) { // Método que crea un Actor basado en un nombre proporcionado
        return OnStage.theActorCalled(actorName); // Retorna un Actor creado con el nombre proporcionado
    }

    @Before // Anotación que marca un método a ejecutar antes de cada escenario de Cucumber
    public void setTheStage() { // Método que configura el escenario de actuación (OnStage)
        OnStage.setTheStage(new OnlineCast()); // Configura el escenario de actuación para utilizar un elenco de actores en línea (OnlineCast)
    }
}
