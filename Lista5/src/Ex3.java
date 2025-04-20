import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] notas = new int[10];
        int soma = 0;
        
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota:  ");
            notas[i] = scanner.nextInt();  
            soma += notas[i]; 

            if (notas[i] > maior) {
                maior = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        
        double media = soma / (double) notas.length;
        
        System.out.println("\nAs notas digitadas foram:  ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("A nota é: 1 " + notas[i]);
        }
        
        System.out.println("\nA média das notas é: " + media);
        System.out.println("A maior nota é: " + maior);
        System.out.println("A menor nota é: " + menor);
        
        scanner.close();  
}
}