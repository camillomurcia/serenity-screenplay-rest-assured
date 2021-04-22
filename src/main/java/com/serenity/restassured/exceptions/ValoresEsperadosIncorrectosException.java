package com.serenity.restassured.exceptions;

public class ValoresEsperadosIncorrectosException extends AssertionError {
  public static final String VALORES_ESPERADOS_INCORRECTOS =
      "Los valores esperados en la respuesta del servicio no son correctos";

  public ValoresEsperadosIncorrectosException(String mensaje, Throwable e) {
    super(mensaje, e);
  }
}
