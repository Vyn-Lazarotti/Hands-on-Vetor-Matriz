import java.util.*;

public class ex2 {
    public static void main(String [] arguments){
        Scanner sc = new Scanner(System.in);
        
        int num = 8;
        double[] a = new double[num];
        double[] b = new double[num];

        for(int i = 0; i < num; i++) {
            System.out.println("\nDigite um número: ");
            a[i] = sc.nextDouble();
            for (int j = 0; j < num; j++) {
                b[j] = a[i] * 3;
                System.out.println(b[j]);
            }
        }

        sc.close();
    }
}
