package aps.poo;

public class Cordenada {
  private int x;
  private int y;

  public Cordenada() {
  }

  public Cordenada(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public String imprimir() {
    return "Cordenada: x=" + x + " | y=" + y;
  }
  
  @Override
  public String toString() {
    return "Cordenada [x=" + x + ", y=" + y + "]";
  }
}
