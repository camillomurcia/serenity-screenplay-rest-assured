package com.serenity.restassured.tasks;

import static com.serenity.restassured.utils.enums.EnumRequestSoap.CONVERTIR_NUMERO_LETRAS_INGLES;
import static com.serenity.restassured.utils.enums.UtilidadesSoap.obtenerRequestSoap;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class ConvertirNumero implements Task {
  private static final String ENDPOINT = "/webservicesserver/NumberConversion.wso";

  private String numeroConvertir;

  public ConvertirNumero(String numeroConvertir) {
    this.numeroConvertir = numeroConvertir;
  }

  public static ConvertirNumero enIngles(String numeroConvertir) {
    return instrumented(ConvertirNumero.class, numeroConvertir);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Post.to(ENDPOINT)
            .with(
                request ->
                    request
                        .header("Content-Type", "text/xml; charset=utf-8")
                        .body(obtenerRequestConvertirNumeroConData())));
  }

  private String obtenerRequestConvertirNumeroConData() {
    return obtenerRequestSoap(CONVERTIR_NUMERO_LETRAS_INGLES.getPathArchivo())
        .replace("{numeroConvertir}", numeroConvertir);
  }
}
