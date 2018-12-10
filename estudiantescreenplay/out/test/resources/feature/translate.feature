Feature: Estudiante
  Yo como estudiante
  Quiero agregar una tarea
  Para poder verla en mis lista de tareas

   Scenario Outline: Adicionar una nueva tarea
    Given Adicionar una nueva tarea
    When  Ingreso al home de la pagina
    And   ingreso la nueva "<tarea>"
    Then  ver ingresada la nueva tarea <respuesta>

    Examples:
    |tarea | respuesta |
    |Presentar examen Screenplay 7 A.M 10 Lunes de Diciembre| Presentar examen Screenplay 7 A.M 10 Lunes de Diciembre|



