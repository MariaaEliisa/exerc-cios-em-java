import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	int num = scanner.nextInt();
	
	for(int i = 0; i < num; i++ ) {
		if(i % 2 == 1)
			System.out.println(i);
	}
	
	scanner.close();

	}

}
