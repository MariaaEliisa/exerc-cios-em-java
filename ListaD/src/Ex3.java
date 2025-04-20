import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite uma nota entre 1 e 5: ");
	int nota = scanner.nextInt();
	
	System.out.println("Digite o seu salário: ");
	double salario = scanner.nextDouble();
	
	double aumento = 0;
	
	if(nota < 1) {
		
		aumento = 0;
	} else if(nota == 2){
		
		aumento = salario*0.05;
		
	} else if(nota == 3 ) {
		
		aumento = salario*0.10;
	} else if(nota == 4) {
		
		aumento = salario*0.15;
	} else if(nota ==5) {
		
		aumento = salario*0.20;
	} else {
		
	System.out.println("O número que você digitou é inválido: ");
	}
	double SalarioLiquido = salario + aumento;
	
	System.out.println("Seu sálario original é:" + salario);
	System.out.println("Seu aumento foi de: " + aumento);
	System.out.println("Seu novo salário é: " + SalarioLiquido);
	
	scanner.close();
	
	}

}
