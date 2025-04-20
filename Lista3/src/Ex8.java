
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.println("Os primeiros números da sequência de Fibonacci são:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " "); 

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}
