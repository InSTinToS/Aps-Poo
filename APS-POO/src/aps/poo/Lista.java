package aps.poo;

class Lista<T> {

    class Celula {

        private Celula anterior;
        private Celula proximo;
        private T dado;

        public Celula(Celula anterior, Celula proximo, T dado) {
            this.anterior = anterior;
            this.proximo = proximo;
            this.dado = dado;
        }

        public Celula getAnterior() {
            return this.anterior;
        }

        public void setAnterior(Celula anterior) {
            this.anterior = anterior;
        }

        public Celula getProximo() {
            return this.proximo;
        }

        public void setProximo(Celula proximo) {
            this.proximo = proximo;
        }

        public T getDado() {
            return this.dado;
        }

        public void setDado(T dado) {
            this.dado = dado;
        }

        @Override
        public String toString() {
            return "Celula [anterior=" + anterior + ", dado=" + dado + ", proximo=" + proximo + "]";
        }

    }

    private Celula atual;
    private int tamanho = 0;

    public Lista(T dadoInicial) {
        this.atual = new Celula(null, null, dadoInicial);
        this.tamanho ++;
    }

    public Lista() {
        this.atual = null;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public T getAtual() {
        return this.atual.getDado();
    }

    public void setAtual(T dado) {
        this.atual.dado = dado;
    }

    public void primeiro() {
        while (this.atual.getAnterior() != null) {
            this.atual = this.atual.getAnterior();
        }
    }

    public void ultimo() {
        while (this.atual.getProximo() != null) {
            this.atual = this.atual.getProximo();
        }
    }

    public void anterior() {
        this.atual = atual.getAnterior();
    }

    public void proximo() {
        this.atual = atual.getProximo();
    }

    public void adicionarAnterior(T dado) {
        Celula novaCelula = new Celula(atual.getAnterior(), atual, dado);

        if (this.atual != null) {
            this.atual.setAnterior(novaCelula);
        }

        this.atual = novaCelula;
        this.tamanho++;
    }

    public void adicionarProximo(T dado) {
        if (this.atual != null) {
            Celula novaCelula = new Celula(atual, atual.getProximo(), dado);

            this.atual.setProximo(novaCelula);

            this.atual = novaCelula;
        } else {
            Celula novaCelula = new Celula(atual, null, dado);
            
            this.atual = novaCelula;
        }
        
        System.out.println(this.atual.dado);
        this.tamanho++;
    }
}
