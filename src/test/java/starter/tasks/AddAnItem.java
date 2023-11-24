package starter.tasks; // Define el paquete al que pertenece esta clase

import net.serenitybdd.screenplay.Performable; // Importa la interfaz Performable de Serenity Screenplay
import net.serenitybdd.screenplay.Task; // Importa la interfaz Task de Serenity Screenplay
import net.serenitybdd.screenplay.actions.Enter; // Importa la clase Enter de Serenity Screenplay para acciones de entrada de texto
import org.openqa.selenium.Keys; // Importa la clase Keys de Selenium para manejar teclas del teclado
import starter.helpers.TodoListPage; // Importa la clase TodoListPage del paquete helpers

public class AddAnItem { // Declara la clase AddAnItem para representar una tarea de agregar un ítem a la lista

    public static Performable withName(String itemName) { // Método estático para realizar la acción de agregar un ítem con un nombre específico
        return Task.where("{0} agrega la tarea con el nombre: " + itemName, // Define la descripción de la tarea con un nombre específico usando la notación {0} para el actor
                Enter.theValue(itemName) // Ingresa el valor del nombre del ítem en un campo de entrada
                        .into(TodoListPage.ITEM_NAME_FIELD) // Entra en el campo específico definido en TodoListPage (campo de nombre de tarea)
                        .thenHit(Keys.ENTER) // Luego presiona la tecla "Enter" después de ingresar el nombre del ítem
        );
    }
}
