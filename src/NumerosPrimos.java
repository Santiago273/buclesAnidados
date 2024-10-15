import java.util.Scanner;

public class NumerosPrimos {
    int contador;
    int j;
    public void esPrimo(int n){
        Scanner sc = new Scanner(System.in);
        while (n < 0){
            System.out.println("El numero debe ser mayor a cero");
            n = sc.nextInt();
        }
        for (int i = 2; i <= n; i++){
            contador = 0;
            for ( j = 2; j <= n; j++) {
                if (i%j == 0){
                    contador++;
                }
                }
            if (contador == 1){
                System.out.println(i);
            }

        }

    }
}
