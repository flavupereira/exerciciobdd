  ## **Projeto de Automação de Testes BDD com Cucumber e Selenium**

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

- Java 21

- Maven 3.6+

- Chrome Browser

## Dependências Maven

**As principais dependências estão configuradas no pom.xml:**

- **cucumber-java (7.16.1)** - Implementação do Cucumber

- **cucumber-junit (7.16.1)** - Integração com JUnit

- **selenium-java (4.20.0)** - Automação web

- **junit (4.11)** - Framework de testes

  ## 🚀 Executando os Testes

  ### Via Maven

  ```
  mvn test
  ```
  ### Via IDE

  Execute a classe RunCucumberTest localizada em cucumber.resources.

## 📝 Cenários de Teste

 ### Feature: Cadastro
**Cenário: Usuário faz login com sucesso**

- Dado que o usuário está na página de login

- Quando o usuário preenche o campo username com "tomsmith"

- E o usuário preenche o campo password com "SuperSecretPassword!"

- E o usuário clica no botão de login

- Então o usuário deve ser redirecionado para a página home

- E uma mensagem de boas-vindas deve ser exibida

## 🎯 Funcionalidades Implementadas

 ## Pages Objects
 
- **BasePage:** Classe base com configuração do WebDriver

- **SingUpPage:** Contém métodos para interagir com a página de login:

   Preenchimento de campos

   Clique em elementos

   Verificação de URLs

   Validação de mensagens

###Step Definitions
  
Mapeia os passos do Gherkin para ações de automação:

- Navegação para a página de login

- Preenchimento de formulários

- Submissão do formulário

- Validações de redirecionamento e mensagens

## 📊 Resultados dos Testes

Os testes são executados via JUnit e geram relatórios no formato XML. O projeto está 
configurado para executar 2 cenários de teste com sucesso.

## ⚙️ Configuração do Ambiente de Desenvolvimento

O projeto inclui configuração para VS Code no arquivo settings.json:

- Atualização automática da configuração de build

- Análise de nulos automática

## 🔄 Fluxo de Trabalho

1. Escrever cenários em Gherkin no arquivo .feature

2. Implementar step definitions mapeando os passos

3. Desenvolver page objects para interação com a aplicação

4. Executar testes via Maven ou IDE

5. Analisar resultados e relatórios
  
