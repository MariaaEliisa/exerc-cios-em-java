import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	double sub = 0;
	
	while (sub >= -1000) {
		
		System.out.println("Digite um número: ");
		double num = scanner.nextDouble();
		sub -= num;
		
		System.out.println("A subtração é: " + sub);
	}
	scanner.close();
	}

}
