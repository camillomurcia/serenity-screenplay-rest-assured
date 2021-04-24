package com.serenity.restassured.tasks.rest;

import static com.serenity.restassured.utils.UtilidadesRest.obtenerJson;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.serenity.restassured.models.Empleado;
import com.serenity.restassured.models.builder.EmpleadoBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class CrearUsuario implements Task {

  private static final String ENDPOINT = "/api/users";
  public static final String VARIABLE_SESION_EMPLEADO = "Variable sesion empleado";
  private Empleado datosEmpleado;

  public CrearUsuario(Empleado datosEmpleado) {
    this.datosEmpleado = datosEmpleado;
  }

  public static CrearUsuario enElSistema(EmpleadoBuilder empleadoBuilder) {
    return instrumented(CrearUsuario.class, empleadoBuilder.build());
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Post.to(ENDPOINT)
            .with(
                request ->
                    request
                        .header("Content-Type", "application/json")
                        .body(obtenerJson(datosEmpleado))));
    actor.remember(VARIABLE_SESION_EMPLEADO, datosEmpleado);
  }
}
