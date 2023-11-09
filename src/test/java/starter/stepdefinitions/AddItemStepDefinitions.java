package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.TodoListPage;
import starter.tasks.AddAnItem;
import starter.tasks.NavigateTo;

public class AddItemStepDefinitions {

    @Given("{actor} esta observando su lista de tareas")
    public void actor_is_looking_at_his_todo_list(Actor actor) {
        actor.attemptsTo(NavigateTo.theTodoListPage());
    }

    @When("{actor} agrega una tarea con nombre {string} a la lista")
    public void he_adds_to_the_list(Actor actor, String itemName) {
        actor.attemptsTo(AddAnItem.withName(itemName));
    }

    @Then("{actor} ve {string} como un elemento de la lista de tareas")
    public void he_sees_as_an_item_in_the_todo_list(Actor actor, String expectedItemName) {
        actor.attemptsTo(Ensure.that(TodoListPage.ITEMS_LIST).hasText(expectedItemName));
    }
}

