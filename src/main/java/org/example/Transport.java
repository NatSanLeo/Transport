package org.example;

public class Transport {

  private String motor;
  private int numeroPuestos;
  private String marca;
  private String color;
  private String tamaño;
  private int cilindraje;
  private String combustible;




  public Transport(String motor, String combustible, int cilindraje) {
    this.motor = motor;
    this.combustible = combustible;
    this.cilindraje = cilindraje;

  }

  public String getMotor() {
    return motor;
  }

  public int getNumeroPuestos() {
    return numeroPuestos;
  }

  public String getMarca() {
    return marca;
  }

  public String getColor() {
    return color;
  }

  public String getTamaño() {
    return tamaño;
  }

  public int getCilindraje() {
    return cilindraje;
  }

  public String getCombustible() {
    return combustible;
  }

  public Transport(String motor, int numeroPuestos, String marca, String color, String tamaño,
      int cilindraje, String combustible) {
    this.motor = motor;
    this.numeroPuestos = numeroPuestos;
    this.marca = marca;
    this.color = color;
    this.tamaño = tamaño;
    this.cilindraje = cilindraje;
    this.combustible = combustible;

  }

}

