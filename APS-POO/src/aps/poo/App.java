package aps.poo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cordenada supEsq = new Cordenada();
        Cordenada infDir = new Cordenada();
        Fazenda fazenda = new Fazenda();
        int qntDeMeteoros;

        System.out.println("Nome da fazenda:");;
        fazenda.setNome(teclado.nextLine());

        System.out.println("Canto superior esquerdo:");
        System.out.print("X: ");
        supEsq.setX(teclado.nextInt());
        System.out.print("Y: ");
        supEsq.setY(teclado.nextInt());
        fazenda.setSupEsq(supEsq);

        System.out.println("Canto inferior direito:");
        System.out.print("X: ");
        infDir.setX(teclado.nextInt());
        System.out.print("Y: ");
        infDir.setY(teclado.nextInt());
        fazenda.setInfDir(infDir);

        System.out.println("Quantidade de meteoros:");
        qntDeMeteoros = teclado.nextInt();

        System.out.println("Lista das coordenadas de cada meteoro:");

        Lista<Meteoro> listaMeteoros = new Lista();

        for (int i = 0; i < qntDeMeteoros; i++) {

            System.out.println("Meteoro " + (i + 1) + ":");
            int x = teclado.nextInt();
            int y = teclado.nextInt();

            Meteoro meteoro = new Meteoro(x, y);

            if (i == 0)
                listaMeteoros.setAtual(meteoro);
            else
                listaMeteoros.adicionarProximo(meteoro);
        }

        fazenda.setListaMeteoros(listaMeteoros);

        teclado.close();

        System.out.println("Dados da fazenda:");
        System.out.println(fazenda.imprimir());

        System.out.println(fazenda.calcularQntMeteorosQCaiuDentro() + " Meteoros caíram na fazenda");
    }
}
