package com.serenity.restassured.questions.rest;

import static com.serenity.restassured.tasks.rest.CrearUsuario.VARIABLE_SESION_EMPLEADO;
import static com.serenity.restassured.utils.UtilidadesRest.convertirJsonMap;
import static net.serenitybdd.rest.SerenityRest.lastResponse;

import com.serenity.restassured.models.Empleado;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.commons.lang3.StringUtils;

public class VerificarCreacionUsuario implements Question<Boolean> {

  private Map jsonConvertido;
  private Empleado datosEmpleado;

  public static VerificarCreacionUsuario deLaRespuesta() {
    return new VerificarCreacionUsuario();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    jsonConvertido = convertirJsonMap(lastResponse().getBody().prettyPrint());
    datosEmpleado = actor.recall(VARIABLE_SESION_EMPLEADO);
    return verificarDatosUsuario() && verificarCamposInformativos();
  }

  private boolean verificarDatosUsuario() {
    return datosEmpleado.getName().equals(jsonConvertido.get("name"))
        && datosEmpleado.getJob().equals(jsonConvertido.get("job"));
  }

  private boolean verificarCamposInformativos() {
    return !"".equals(jsonConvertido.get("createdAt"))
        && StringUtils.isNumeric((CharSequence) jsonConvertido.get("id"));
  }
}
