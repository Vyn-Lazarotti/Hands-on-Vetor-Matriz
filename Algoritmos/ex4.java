import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] carro = new String[5];
        double[] consumo = new double[5];
        int economico = 0;

        for (int i = 0; i < carro.length; i++) {
            System.out.println("\nModelo do carro " + (i + 1) + ": ");
            carro[i] = teclado.nextLine();
            System.out.println("\nConsumo por km: ");
            consumo[i] = teclado.nextDouble();
        }

        for (int j = 1; j < consumo.length; j++) {
            if (consumo[j] > consumo[economico]) {
                economico = j;
            }
        }

        System.out.println("\nO carro mais econômico é " + carro[economico]);

        System.out.println("--- Consumo de combustível para percorrer 1000 km ---");
        for (int k = 0; k < carro.length; k++) {
            double litro = 1000 / consumo[k];
            System.out.printf("\n%s consome %.2f litros\n", carro[k], litro);
        }

        teclado.close();
    }
}
