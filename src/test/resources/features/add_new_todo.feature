Feature: Agregar nuevo elemento a la lista de tareas
  @Prueba
  Scenario: Agregar "Terminar Trabajo de progamacion" a la lista de tareas
    Given brandon esta observando su lista de tareas
    When brandon agrega una tarea con nombre "Terminar Trabajo de progamacion" a la lista
    Then brandon ve "Terminar Trabajo de progamacion" como un elemento de la lista de tareas

    