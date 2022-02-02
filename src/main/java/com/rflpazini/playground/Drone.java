package com.rflpazini.playground;

public class Drone {
  private int id;
  private int flightRange;

  public Drone(int id, int flightRange) {
    this.id = id;
    this.flightRange = flightRange;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getFlightRange() {
    return flightRange;
  }

  public void setFlightRange(int flightRange) {
    this.flightRange = flightRange;
  }
}
