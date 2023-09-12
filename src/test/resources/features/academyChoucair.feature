# Autor: Sergio A.
@stories
Feature: Filling out the form to create a user
  @scenario
  Scenario: Create user successfully
    Given correctly the information in the alphanumeric fields
    When Click on the Sign in button
    Then you can fill the login fields for the start of
      |srtUser|srtUser2|correo           |dia|mes  |ano |lenguaje|ciudad|postal|contrasena     |contrasenaRe   |sistemaoperativo|sistemaversion|sistemalenguaje|
      |sergio |salas   |sergio5@gmail.com|6  |Apr  |1993|spa     |Bogot |50001 |FxhDJvkZqT8KfPB|FxhDJvkZqT8KfPB|linux           |xp            |spanish        |


