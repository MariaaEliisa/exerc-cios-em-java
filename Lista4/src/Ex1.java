import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int num = scanner.nextInt();
		int i = 0;
		
		while(i < num)
		{
			i++;
			System.out.println(i);
		}
		
		scanner.close();
	}

}
