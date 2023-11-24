package starter.tasks; // Define el paquete al que pertenece esta clase

import net.serenitybdd.screenplay.Performable; // Importa la interfaz Performable de Serenity Screenplay
import net.serenitybdd.screenplay.Task; // Importa la interfaz Task de Serenity Screenplay
import net.serenitybdd.screenplay.actions.Open; // Importa la clase Open de Serenity Screenplay para abrir una página web
import starter.helpers.TodoListPage; // Importa la clase TodoListPage del paquete helpers

public class NavigateTo { // Declara la clase NavigateTo para representar una tarea de navegación a una página específica

    public static Performable theTodoListPage() { // Método estático para realizar la acción de abrir la página de lista de tareas
        return Task.where("{0} ingresa a la página de tareas", // Define la descripción de la tarea usando la notación {0} para el actor
                Open.browserOn().the(TodoListPage.class) // Abre el navegador en la página de la lista de tareas, utilizando la clase TodoListPage como destino
        );
    }
}
