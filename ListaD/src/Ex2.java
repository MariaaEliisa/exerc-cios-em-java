import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva um número de 1 a 10: ");
		int num = scanner.nextInt();
		
		String[] numextenso = { "Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez"
		};
		
		if(num >= 1 && num <= 10) {
		 if(num > 5) {
			for (int i = num; i <= 10; i++) {
			System.out.println(numextenso[i]);
			} 
			
		} else {
			System.out.println(numextenso[num]);
		}
		} else {
		System.out.println("O número que você escreveu é inválido. Digite um número de 1 a 10");
		}
		
		
		scanner.close();

	}

}
