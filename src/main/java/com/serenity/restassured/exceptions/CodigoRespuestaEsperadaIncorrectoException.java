package com.serenity.restassured.exceptions;

public class CodigoRespuestaEsperadaIncorrectoException extends AssertionError {
  public static final String CODIGO_ESPERADO_INCORRECTO =
      "La respuesta esperada del codigo es incorrecta";

  public CodigoRespuestaEsperadaIncorrectoException(String mensaje, Throwable e) {
    super(mensaje, e);
  }
}
