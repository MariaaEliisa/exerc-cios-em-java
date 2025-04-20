import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	double soma = 0;
	
	while (soma  <= 1000) {
		System.out.println("Digite um número: ");
		double num = scanner.nextDouble();
		soma += num;
		System.out.println("A soma é: " + soma);
		
	}
	
	scanner.close();

	}

}
