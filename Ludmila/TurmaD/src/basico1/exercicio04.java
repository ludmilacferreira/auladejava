package basico1;
import java.util.Scanner;

public class exercicio04 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("digite um número: ");
	int num = entrada.nextInt ();
	if (num == 1) {
		System.out.println("Domingo");
		}
	else if (num == 2)	{	
		System.out.println("Segunda");
	}
	else if (num == 3) {
		System.out.println("Terça");
	}
	else if (num == 4) {
		System.out.println("Quarta");
	}
	else if (num == 5) {
		System.out.println("Quinta");
	}
	else if (num == 6) {
		System.out.println("Sexta");
	}
	else if (num == 7) {
		System.out.println("Sábado");
	}
}
}