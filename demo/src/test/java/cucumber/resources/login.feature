Feature: Cadastro
    Scenario: Usuário faz login com sucesso
    Given the user is on the login page
    When the user enters "example_user" into the username field
    And the user enters "example_password" into the password field
    And the user clicks the login button
    Then the user should be redirected to the home page
    And a welcome message "Welcome, example_user!" should be displayed
    