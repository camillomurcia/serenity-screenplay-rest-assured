package com.serenity.restassured.stepdefinitions.soap;

import static com.serenity.restassured.exceptions.CodigoRespuestaEsperadaIncorrectoException.CODIGO_ESPERADO_INCORRECTO;
import static com.serenity.restassured.exceptions.ValoresEsperadosIncorrectosException.VALORES_ESPERADOS_INCORRECTOS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.serenity.restassured.exceptions.CodigoRespuestaEsperadaIncorrectoException;
import com.serenity.restassured.exceptions.ValoresEsperadosIncorrectosException;
import com.serenity.restassured.questions.VerificarCodigoRespuesta;
import com.serenity.restassured.questions.VerificarConversionNumero;
import com.serenity.restassured.tasks.ConvertirNumero;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

public class ConvertirNumeroLetrasInglesStepDefinitions {

  private EnvironmentVariables environmentVariables;

  @Cuando("(.*) envia el numero (.*)")
  public void enviarNumero(String nombreActor, String numeroConvertir) {
    theActorCalled(nombreActor)
        .whoCan(CallAnApi.at(environmentVariables.getProperty("api.soap.baseUrl")))
        .attemptsTo(ConvertirNumero.enIngles(numeroConvertir));
  }

  @Entonces("deberia ver el numero en ingles: (.*)")
  public void observarNumeroEnIngles(String numeroIngles) {
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarCodigoRespuesta.delServicio(200))
                .orComplainWith(
                    CodigoRespuestaEsperadaIncorrectoException.class, CODIGO_ESPERADO_INCORRECTO));
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarConversionNumero.enIngles(numeroIngles))
                .orComplainWith(
                    ValoresEsperadosIncorrectosException.class, VALORES_ESPERADOS_INCORRECTOS));
  }
}
