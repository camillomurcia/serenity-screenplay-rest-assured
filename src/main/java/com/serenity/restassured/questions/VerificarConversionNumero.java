package com.serenity.restassured.questions;

import static com.serenity.restassured.utils.enums.UtilidadesSoap.obtenerValorEtiquetaXML;
import static net.serenitybdd.rest.SerenityRest.lastResponse;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

public class VerificarConversionNumero implements Question<Boolean> {

  private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
  private String numeroIngles;

  public VerificarConversionNumero(String numeroIngles) {
    this.numeroIngles = numeroIngles;
  }

  public static VerificarConversionNumero enIngles(String numeroIngles) {
    return new VerificarConversionNumero(numeroIngles);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    String respuestaObtenida = null;
    try {
      respuestaObtenida =
          obtenerValorEtiquetaXML(lastResponse().getBody().prettyPrint(), "m:NumberToWordsResult");
    } catch (IOException | SAXException | ParserConfigurationException e) {
      throw new RuntimeException(e);
    }
    return respuestaObtenida.contains(numeroIngles);
  }
}
