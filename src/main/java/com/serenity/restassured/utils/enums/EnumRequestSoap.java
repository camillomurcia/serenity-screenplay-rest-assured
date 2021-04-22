package com.serenity.restassured.utils.enums;

public enum EnumRequestSoap {
  CONVERTIR_NUMERO_LETRAS_INGLES("src/test/resources/request/soap/ConvertirNumeroLetrasIngles.xml");

  private String pathArchivo;

  EnumRequestSoap(String pathArchivo) {
    this.pathArchivo = pathArchivo;
  }

  public String getPathArchivo() {
    return pathArchivo;
  }
}
