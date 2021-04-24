package com.serenity.restassured.runners.rest;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/rest/crear_usuario.feature",
    glue = {"com.serenity.restassured.stepdefinitions"})
public class CrearUsuarioRunner {}
