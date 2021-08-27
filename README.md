# Automatizacion de pruebas para servicios SOAP Y REST

[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=camillomurcia_serenity-screenplay-rest-assured&metric=sqale_index)](https://sonarcloud.io/dashboard?id=camillomurcia_serenity-screenplay-rest-assured)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=camillomurcia_serenity-screenplay-rest-assured&metric=alert_status)](https://sonarcloud.io/dashboard?id=camillomurcia_serenity-screenplay-rest-assured)
![Build](https://github.com/camillomurcia/serenity-screenplay-rest-assured/actions/workflows/pipelineBuild.yml/badge.svg)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Building automated tests with the Screenplay Pattern of Serenity, Cucumber, Junit,
Java and Gradle to test a REST and a SOAP

- [Serenity BDD reports for this project](https://camillomurcia.github.io/serenity-screenplay-rest-assured/)

The following exposed services are used for this automation:

- REST: [https://reqres.in](https://reqres.in)
- SOAP: [https://www.dataaccess.com/webservicesserver/NumberConversion.wso](https://www.dataaccess.com/webservicesserver/NumberConversion.wso)

 ### Built tests 📋

 #### REST ####

 - User creation

 #### SOAP ####

 - Send a number for the service and have it return the number in English 

## What do you need before downloading the repository 🛠️ ##

 - Java JDK 1.8
 - Gradle 3.2.0 or higher
 - GIT 

## Design patterns used 🧮

- ### [Builder Pattern](https://github.com/sauljabin/design-patterns-java#builder)

- ### [Serenity Screenplay Pattern](http://serenity-bdd.info/docs/articles/screenplay-tutorial.html)

 ## Project structure 🗼

    .
    ├── src              
    │   ├── main                         # Source files 
    │   │   └── com.serenity.restassured
    │   │       ├── exceptions           # Custom exceptions 
    │   │       ├── models               # Package where the models are located - Object
    │   │       │   └── builder          # Builder pattern classes
    │   │       │
    │   │       ├── questions            # Package where classes are stored to obtain data from the service, response from the service, etc.
    │   │       │   ├── rest             # Specific classes for REST
    │   │       │   └── soap             # Specific classes for SOAP
    │   │       │                         
    │   │       ├── tasks                # Package where the tasks that perform the consumption of the service are stored, etc.
    │   │       │   ├── rest             # Specific classes for REST
    │   │       │   └── soap             # Specific classes for SOAP
    │   │       │
    │   │       └── utils                # Utilities developed
    │   │                        
    │   ├── test                         # Files for the execution of the tests
    │   │   ├── com.serenity.restassured
    │   │   │   ├── runners              # Test execution classes
    │   │   │   │   ├── rest             # Execution classes for REST services
    │   │   │   │   └── soap             # Execution classes for SOAP services
    │   │   │   │
    │   │   │   └── stepdefinitions      # Classes with the Java method with an expression that links it to one or more Gherkin steps
    │   │   │       ├── rest             # StepDefinitions classes for REST services
    │   │   │       └── soap             # StepDefinitions classes for SOAP services
    │   │   │    
    │   │   └── resources
    │   │       ├── features             # Package where the scenarios are stored in Gherkin language
    │   │       │   ├── rest             # Gherkin language scenarios for REST services
    │   │       │   └── soap             # Gherkin language scenarios for SOAP services
    │   │       │
    │   │       └── request              # Package where xml or json file is stored with the service request
    │   │           └── soap             # Package where xml file is stored with the request of the SOAP service
    │   └── ···
    │
    └── ···

## Compilation ⚙️

Once the project has been downloaded, import it into the IDE of preference.

It is important to compile the project for this, execute one of the following commands.
Run by console

```
gradle clean build -x test
gradle compileJava
```

## Execution 🚀

**Execution All tests**

To run all the project tests and generate the report you can use.

```
gradle clean test aggregate
```

**NOTE:** The report generated from the tests is generated in the route `/target/site/serenity/index.html`

## Contribution 🖇️

Contributions are what make the open source community such an amazing place to learn, inspire, and create. ** Any contribution you make will be greatly appreciated. **

1. Fork the project
2. Create your feature branch (`git checkout -b feature / AmazingFeature`)
3. Commit your changes (`git commit -m 'Adding something to AmazingFeature branch'`)
4. upload the branch (`git push origin feature / AmazingFeature`)
5. Open a Pull Request

## License 📄

Distributed under the Apache-2.0 license. See `LICENSE` for more information.
