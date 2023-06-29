Feature: As a data consumer, I want the department information stored in postgess DB correctly in department title
  Background:
    Given Establish the database connection


  Scenario: verify database departments table columns
    When Execute query to get all column for "departments"
    Then verify the below column sare listed in result for

    |tax|
    |bookkeeping|
    |payroll|
    |consultancy-services|
