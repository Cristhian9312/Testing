Feature: ingresar a la página página  de empleos de la empresa
  choucair testing y realizar las pruebas necesarias, seleccionando
  las opciones de los filtros, seleccionando las industrias y comunicados
  que ellos realizan

  Scenario: Buscar empleos disponibles con keywords y locations
    Given que la persona busca algo en concreto
    When Ingresa una palabra clave del trabajo Analista, Bogota
    Then Puede ver las ofertas laborales disponibles

  Scenario: Buscar empleos disponibles con Locations
    Given que la persona busca trabajo en la ciudad que vive
    When Ingresa una locacion Medellin y busca
    Then Puede ver las ofertas laborales disponibles

  Scenario: Buscar empleos disponibles Por Keywords
    Given Que la persona quiere ver todas las ofertas por Analista
    When Busca por Analista
    Then Se muestran todas las ofertas disponibles en la empresa