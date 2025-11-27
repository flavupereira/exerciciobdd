## Projeto de Automação de Testes BDD com Cucumber e Selenium

Este projeto implementa testes de automação web utilizando a metodologia BDD 
(Behavior-Driven Development) com Cucumber e Selenium WebDriver.

## 📋 Descrição

O projeto realiza testes de login em uma aplicação web, validando o fluxo de 
autenticação de usuários na página The Internet Herokuapp.

## 🛠 Tecnologias Utilizadas

- Java 21 - Linguagem de programação

- Maven - Gerenciamento de dependências e build

- Cucumber - Framework BDD

- Selenium WebDriver - Automação web

- JUnit - Framework de testes

  ## 📁 Estrutura do Projeto

  src/
├── main/java/com.example/
│   └── Main.java
└── test/java/
    ├── cucumber.pages/
    │   ├── BasePage.java
    │   └── SingUpPage.java
    └── cucumber.resources/
        ├── RunCucumberTest.java
        └── StepDefinitions.java
resources/
└── cucumber.resources/
    └── login.feature

  ## 🔧 Configuração
**Pré-requisitos** 

-Java 21

- Maven 3.6+

- Chrome Browser

## Dependências Maven

As principais dependências estão configuradas no pom.xml:

- **cucumber-java (7.16.1)** - Implementação do Cucumber

- **cucumber-junit (7.16.1)** - Integração com JUnit

- **selenium-java (4.20.0)** - Automação web

- **junit (4.11)** - Framework de testes
