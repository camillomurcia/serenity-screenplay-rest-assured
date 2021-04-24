package com.serenity.restassured.models.builder;

import com.serenity.restassured.models.Empleado;

public class EmpleadoBuilder {

  private String name;
  private String job;

  public EmpleadoBuilder() {
    this.name = "";
    this.job = "";
  }

  public static EmpleadoBuilder con() {
    return new EmpleadoBuilder();
  }

  public EmpleadoBuilder elNombre(String nombre) {
    this.name = nombre;
    return this;
  }

  public EmpleadoBuilder yPuestoTrabajo(String puestoTrabajo) {
    this.job = puestoTrabajo;
    return this;
  }

  public String getName() {
    return name;
  }

  public String getJob() {
    return job;
  }

  public Empleado build() {
    return new Empleado(this);
  }
}
