import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] assentos = new int[20][10];
        int ingressos = 0, opcao;

        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                assentos[i][j] = -1;
            }
        }

        do {

            System.out.println("--- Menu ---");
            System.out.println("1 - Vender ingresso");
            System.out.println("2 - Exibir o total de ingressos vendidos");
            System.out.println("3 - Exibir as poltronas");
            System.out.println("4 - Encerrar");
            System.out.println("Digite a opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o número da fila (0-19): ");
                    int fila = teclado.nextInt();
                    System.out.print("Digite o número da poltrona (0-9): ");
                    int poltrona = teclado.nextInt();

                    if (assentos[fila][poltrona] == -1) {
                        assentos[fila][poltrona] = 1;
                        ingressos++;
                        System.out.println("Ingresso vendido com sucesso!");
                    } else {
                        System.out.println("Esta poltrona já foi vendida.");
                    }
                    break;

                case 2:
                    System.out.println("Total de ingressos vendidos: " + ingressos);
                    break;

                case 3:
                    System.out.println("Mapa");
                    for (int i = 0; i < assentos.length; i++) {
                        for (int j = 0; j < assentos[i].length; j++) {
                            System.out.println(assentos[i][j] + " ");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado");
                    break;

                default:
                    throw new AssertionError();
            }

        } while (opcao != 4);

        teclado.close();
    }
}