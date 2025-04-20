import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int soma = 0;
		
		System.out.println("Digite dez números: ");
		for (int i = 1; i <= 10; i++) {
		int num = scanner.nextInt();
		soma+=num;
	}
	
	System.out.printf("A soma é: " + soma);

	scanner.close();
	
	}
		
}
