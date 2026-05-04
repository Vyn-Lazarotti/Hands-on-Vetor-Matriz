import java.util.*;

public class ex1 {
    public static void main(String [] arguments){
        Scanner sc = new Scanner(System.in);
        
        int num = 15;
        String[] nome = new String[num];
        String[] invertida = new String[num];

        for (int i = 0; i < num.length; i++) {
            System.out.println("\nDigite um nome: ");
            nome[i] = sc.nextLine();
            for (int j = nome.length - 1; i >= 0; i--) {
                invertida += nome.charAt(i);
                System.out.println("\n" + invertida[i]);
            }
        }

        sc.close();
    }
}
