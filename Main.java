import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		int[] numeros = new int[10];
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < numeros.length; i++) {
		    System.out.print("Digite um número: ");
		    numeros[i] = sd.nextInt();
		}
		
		maior = menor = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
		    if (numeros[i] > maior){
		        maior = numeros[i];
		    }
		    if (numeros[i]< menor){
		        menor = numeros[i];
		    }
		}
		
		System.out.println("O maior numero é "+ maior);
		System.out.println("O menor numero é " + menor);
	}
}
		