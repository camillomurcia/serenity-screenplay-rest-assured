package com.serenity.restassured.runners.soap;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/soap/convertir_numero_letras_ingles.feature",
    glue = {"com.serenity.restassured.stepdefinitions"})
public class ConvertirNumeroLetrasInglesRunner {}
