Feature: Agregar nuevo elemento a la lista de tareas

  @Prueba
  Scenario: Agregar "Comprar leche" a la lista de tareas
    Given Pedro esta observando su lista de tareas
    When Pedro agrega una tarea con nombre "Comprar leche" a la lista
    Then Pedro ve "Comprar leche" como un elemento de la lista de tareas
