package starter.helpers; // Define el paquete al que pertenece esta clase

import net.serenitybdd.annotations.DefaultUrl; // Importa la anotación DefaultUrl de Serenity
import net.serenitybdd.core.pages.PageObject; // Importa la clase PageObject de Serenity
import net.serenitybdd.screenplay.targets.Target; // Importa la clase Target de Serenity Screenplay

@DefaultUrl("https://todomvc.com/examples/angularjs/#/") // Define la URL por defecto para esta página
public class TodoListPage extends PageObject { // Declara la clase TodoListPage que extiende de PageObject

        // Define un Target (objetivo) para el campo de entrada de nombre de tarea en la página
        public static Target ITEM_NAME_FIELD = Target.the("campo nombre de tarea").locatedBy(".new-todo");

        // Define un Target para la lista de elementos de tarea en la página
        public static Target ITEMS_LIST = Target.the("lista de tareas").locatedBy(".todo-list li");
}
