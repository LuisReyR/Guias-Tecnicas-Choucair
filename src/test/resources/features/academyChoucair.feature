# Autor: Luis Rey

@stories
Feature: Academy Choucair
  As a user, I want to learn how automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
      | strUser   | strPassword |
      | 1121967360 | Choucair2022*     |
    When he search for the course on the choucair academy platform
      | strCourse   |
      | Pruebas de Performance |
    Then he finds the course called
      | strCourse   |
      | Pruebas de Performance Básicas |