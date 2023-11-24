package starter.helpers;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://todomvc.com/examples/angularjs/#/")
public class TodoListPage extends PageObject {


        public static Target ITEM_NAME_FIELD = Target.the("campo nombre de tarea").locatedBy(".new-todo");
        public static Target ITEMS_LIST = Target.the("lista de tareas").locatedBy(".todo-list li");

}