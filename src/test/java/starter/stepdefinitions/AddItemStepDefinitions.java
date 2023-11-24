package starter.stepdefinitions; // Define el paquete al que pertenece esta clase

import io.cucumber.java.en.Given; // Importa las anotaciones Given, When, Then de Cucumber
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor; // Importa la clase Actor de Serenity Screenplay
import net.serenitybdd.screenplay.ensure.Ensure; // Importa la clase Ensure de Serenity Screenplay
import starter.helpers.TodoListPage; // Importa la clase TodoListPage del paquete helpers
import starter.tasks.AddAnItem; // Importa la clase AddAnItem del paquete tasks
import starter.tasks.NavigateTo; // Importa la clase NavigateTo del paquete tasks

public class AddItemStepDefinitions { // Declara la clase AddItemStepDefinitions

    // Método que define el paso "Given" para que un actor esté observando su lista de tareas
    @Given("{actor} esta observando su lista de tareas")
    public void actor_is_looking_at_his_todo_list(Actor actor) {
        actor.attemptsTo(NavigateTo.theTodoListPage()); // El actor intenta navegar a la página de la lista de tareas
    }

    // Método que define el paso "When" para que un actor agregue una tarea con un nombre específico a la lista
    @When("{actor} agrega una tarea con nombre {string} a la lista")
    public void he_adds_to_the_list(Actor actor, String itemName) {
        actor.attemptsTo(AddAnItem.withName(itemName)); // El actor intenta agregar una tarea con el nombre proporcionado a la lista
    }

    // Método que define el paso "Then" para que un actor vea un elemento específico en la lista de tareas
    @Then("{actor} ve {string} como un elemento de la lista de tareas")
    public void he_sees_as_an_item_in_the_todo_list(Actor actor, String expectedItemName) {
        actor.attemptsTo(Ensure.that(TodoListPage.ITEMS_LIST).hasText(expectedItemName)); // El actor verifica que el elemento esperado esté presente en la lista de tareas
    }
}
