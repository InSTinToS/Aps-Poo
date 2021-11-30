package aps.poo;

public class Meteoro {
  private Cordenada cordenada;

  public Meteoro(Cordenada cordenada) {
    this.cordenada = cordenada;
  }

  public Meteoro(int x, int y) {
    this.cordenada = new Cordenada(x, y);
  }

  public Cordenada getCordenada() {
    return cordenada;
  }

  public void setCordenada(Cordenada cordenada) {
    this.cordenada = cordenada;
  }

  public String imprimir() {
    return "Meteoro: {\n " + cordenada.imprimir() + "\n}";
  }
}
