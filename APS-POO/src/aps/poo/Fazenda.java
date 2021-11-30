package aps.poo;

public class Fazenda {
  private String nome;
  private Lista<Meteoro> listaMeteoros;
  private Cordenada infDir;
  private Cordenada supEsq;

  public Fazenda() {
  }

  public Fazenda(String nome, Lista<Meteoro> listaMeteoros, Cordenada infDir, Cordenada supEsq) {
    this.nome = nome;
    this.infDir = infDir;
    this.supEsq = supEsq;
    this.listaMeteoros = listaMeteoros;
  }

  public int calcularQntMeteorosQCaiuDentro() {
    int quantidade = 0;
    listaMeteoros.primeiro();

    for (int i = 0; i < this.listaMeteoros.getTamanho(); i++) {
      Meteoro meteoro = this.listaMeteoros.getAtual();

      if (meteoro.getCordenada().getX() <= this.infDir.getX()
          && meteoro.getCordenada().getX() >= this.supEsq.getX()
          && meteoro.getCordenada().getY() >= this.infDir.getY()
          && meteoro.getCordenada().getY() <= this.supEsq.getY())
        quantidade++;

      this.listaMeteoros.proximo();
    }

    return quantidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Lista<Meteoro> getListaMeteoros() {
    return this.listaMeteoros;
  }

  public void setListaMeteoros(Lista<Meteoro> meteoros) {
    this.listaMeteoros = meteoros;
  }

  public Cordenada getInfDir() {
    return infDir;
  }

  public void setInfDir(Cordenada infDir) {
    this.infDir = infDir;
  }

  public Cordenada getSupEsq() {
    return supEsq;
  }

  public void setSupEsq(Cordenada supEsq) {
    this.supEsq = supEsq;
  }

  public String imprimir() {
    return "fazenda: {"
        + "\n nome: " + nome
        + "\n supEsq: {"
        + "\n   x: " + supEsq.getX()
        + "\n   y: " + supEsq.getY()
        + "\n }"
        + "\n infDir: {"
        + "\n   x: " + infDir.getX()
        + "\n   y: " + infDir.getY()
        + "\n }"
        + "\n}";
  }
}
