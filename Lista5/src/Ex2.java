import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {	
	Scanner scanner = new Scanner(System.in);
	int[] notas = new int[10];
	
	for(int i = 0; i < notas.length; i++) {
		System.out.println("Digite uma nota: ");
		notas[i] = scanner.nextInt();
	}
	
	System.out.println("As notas foram: ");
	for(int i = 0; i < notas.length; i++) {
    System.out.println(notas[i]);
	 
	}
	scanner.close();

	}

}
