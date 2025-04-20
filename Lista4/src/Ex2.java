import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int saida = 18;
	
	System.out.println("Digite um número: ");
	int num = scanner.nextInt();
	
	while (num != saida) {
	System.out.println("Digite um novo número: ");
	int num2 = scanner.nextInt();
	num = num2;
	}
	
	scanner.close();

   }
}