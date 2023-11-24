package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.helpers.TodoListPage;

public class NavigateTo {



        public static Performable theTodoListPage() {
            return Task.where("{0} ingresa a la pagina de tareas",
                    Open.browserOn().the(TodoListPage.class));
        }


    }