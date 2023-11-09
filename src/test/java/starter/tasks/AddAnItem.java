package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.helpers.TodoListPage;

public class AddAnItem {

    public static Performable withName(String itemName){
        return Task.where("{0} agrega la tarea con el nombre: "+itemName,
                Enter.theValue(itemName)
                        .into(TodoListPage.ITEM_NAME_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}

