# Automatizacion de pruebas para servicios API SOAP Y API REST

[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=camillomurcia_serenity-screenplay-rest-assured&metric=sqale_index)](https://sonarcloud.io/dashboard?id=camillomurcia_serenity-screenplay-rest-assured)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=camillomurcia_serenity-screenplay-rest-assured&metric=alert_status)](https://sonarcloud.io/dashboard?id=camillomurcia_serenity-screenplay-rest-assured)
![Build](https://github.com/camillomurcia/serenity-screenplay-rest-assured/actions/workflows/pipelineBuild.yml/badge.svg)

Construccion de pruebas automatizadas con el Patrón Screenplay de Serenity, Cucumber, Junit, 
Java y Gradle para probar una API REST y una API SOAP

Para esta automatización se utilizan los siguientes servicios expuestos:

- API REST (En construccion): [http://dummy.restapiexample.com](http://dummy.restapiexample.com)
- API SOAP: [https://www.dataaccess.com/webservicesserver/NumberConversion.wso](https://www.dataaccess.com/webservicesserver/NumberConversion.wso)

 ### Pruebas construidas 📋

 #### API REST ####

 - En construccion

 #### API SOAP ####

 - Enviar un numero por el servicio y que este me retorne el numero en ingles 

## Que necesitas antes de descargar el repositorio 🛠️ ##

 - Java JDK 1.8
 - Gradle 3.2.0 o superior
 - GIT 

 ## Estructura del proyecto 🗼

    .
    ├── src              
    │    ├── main                           # Archivos fuente  
    │    │   └── com.serenity.restassured
    │    │       ├── exceptions           # Excepciones personalizadas 
    │    │       ├── questions            # Paquete donde se almacenan clases para obtener datos del servcio, respuesta del servicio, etc..
    │    │       ├── tasks                # Paquete donde se almacenan las tareas que realizan el conusmo del servicio, etc..
    │    │       └── utils                # Utilidades desarrolladas
    │    │                        
    │    ├── test                         # Archivos para la ejecucion de las pruebas
    │    │    ├── com.serenity.restassured
    │    │    │    ├── runners            # Clases de ejecucion de las pruebas
    │    │    │    │    └── soap          # Clases de ejecucion para servicios SOAP
    │    │    │    │
    │    │    │    └── stepdefinitions    # Clases con el método Java con una expresión que lo vincula a uno o más pasos de Gherkin
    │    │    │        └── soap           # Clases StepDefinitions para servicios SOAP
    │    │    │    
    │    │    └── resources
    │    │         ├── features           # Paquete donde se almacenan los escenarios en lenguaje Gherkin
    │    │         │   └── soap           # Escenarios en lenguaje Gherkin para servicios SOAP
    │    │         │
    │    │         └── request            # Paquete donde se almacena archivo xml o json con el request del servicio
    │    │             └── soap           # Paquete donde se almacena archivo xml con el request del servicio SOAP
    │    └── ···
    │
    └── ···

## Compilacion ⚙️

Ya descargado el proyecto, importarlo en el IDE de preferencia.

Es importante compilar el proyecto para esto, ejecutar alguno de los siguientes comandos.
Ejecutar por consola

```
gradle clean build -x test
gradle compileJava
```

## Ejecucion 🚀

**Ejecución Todos los test**

Para ejecutar todos los test del proyecto y generar el reporte puede usar.

```
gradle clean test aggregate
```

**NOTA:** El reporte generado de las pruebas se genera en la ruta `/target/site/serenity/index.html`

## Contribucion 🖇️

Las contribuciones son lo que hacen que la comunidad de código abierto sea un lugar tan increíble para aprender, inspirar y crear. **Cualquier contribución que haga será muy apreciada.**

1. Bifurcar el proyecto
2. Cree su rama feature (`git checkout -b feature/AmazingFeature`)
3. Confirme sus cambios (`git commit -m 'Agregando algo en la rama AmazingFeature'`)
4. suba la rama (`git push origin feature/AmazingFeature`)
5. Abra un Pull Request

## Licencia 📄

Distribuido bajo la licencia Apache-2.0. Consulte `LICENSE` para obtener más información.