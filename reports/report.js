$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/bancolombia_simulator.feature");
formatter.feature({
  "name": "free investment credit",
  "description": "  AS a Bancolombia user\n  I want to complete the form\n  To calculate the free investment credit",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "free investment credit calculate with data not allowed in one field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "name": "That I am in Bancolombia free investment credit simulator",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter in the field What do you want to simulate \u003cvalueOne\u003e, field birthdate \u003cvalueTwo\u003e and field What type of rate do you want your loan with \u003cvalueThree\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I hope to see warning messages \"El campo no cumple con el valor mínimo 18 años.\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "valueOne",
        "valueTwo",
        "valueThree"
      ]
    },
    {
      "cells": [
        "\"Simula tu Cuota\"",
        "\"2019-08-24\"",
        "\"Tasa Fija\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "free investment credit calculate with data not allowed in one field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "That I am in Bancolombia free investment credit simulator",
  "keyword": "Given "
});
formatter.match({
  "location": "BancolombiaSimulatorStepDefinition.java:54"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter in the field What do you want to simulate \"Simula tu Cuota\", field birthdate \"2019-08-24\" and field What type of rate do you want your loan with \"Tasa Fija\"",
  "keyword": "When "
});
formatter.match({
  "location": "BancolombiaSimulatorStepDefinition.java:58"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hope to see warning messages \"El campo no cumple con el valor mínimo 18 años.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BancolombiaSimulatorStepDefinition.java:64"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat tests.BancolombiaSimulatorStepDefinition.lambda$new$5(BancolombiaSimulatorStepDefinition.java:66)\n\tat ✽.I hope to see warning messages \"El campo no cumple con el valor mínimo 18 años.\"(file:src/test/resources/features/bancolombia_simulator.feature:16)\n",
  "status": "pending"
});
});