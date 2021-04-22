package com.serenity.restassured.questions;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarCodigoRespuesta implements Question<Boolean> {

  private int codigoRespuestaEsperado;

  private VerificarCodigoRespuesta(int codigoRespuestaEsperado) {
    this.codigoRespuestaEsperado = codigoRespuestaEsperado;
  }

  public static VerificarCodigoRespuesta delServicio(int codigoRespuestaEsperado) {
    return new VerificarCodigoRespuesta(codigoRespuestaEsperado);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return lastResponse().statusCode() == codigoRespuestaEsperado;
  }
}
