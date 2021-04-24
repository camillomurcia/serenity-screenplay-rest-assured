package com.serenity.restassured.models;

import com.serenity.restassured.models.builder.EmpleadoBuilder;

public class Empleado {

  private String name;
  private String job;

  public Empleado(EmpleadoBuilder empleadoBuilder) {
    this.name = empleadoBuilder.getName();
    this.job = empleadoBuilder.getJob();
  }

  public String getName() {
    return name;
  }

  public String getJob() {
    return job;
  }
}
