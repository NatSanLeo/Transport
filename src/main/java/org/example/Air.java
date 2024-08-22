package org.example;

public class Air extends Transport {

  private String tipo;
  private int capacidad;
  private int alas;
  private int numeroLlantas;

  public Air(String tipo, int capacidad, int alas, int numeroLlantas, String motor, int numeroPuestos, String marca,
      String color, String tamaño, int cilindraje, String combustible) {
    super(motor,numeroPuestos,marca,color,tamaño,cilindraje,combustible);
    this.tipo = tipo;
    this.capacidad = capacidad;
    this.alas = alas;
    this.numeroLlantas = numeroLlantas;

  }


}
