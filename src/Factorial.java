import java.util.Scanner;

public class Factorial {
    int n;

    public void factorial(int n){
        Scanner sc = new Scanner(System.in);
        double factorial = 1;
        while (n <= 0){
            System.out.println("Ingrese un numero positivo");
            n = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(factorial);
        }

    }
}
