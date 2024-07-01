package basico1;
import java.util.Scanner;

public class exercicio06 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Digite uma letra (F ou M): ");
	char opcao = input.next().charAt(0);
	
	if (opcao == 'F' || opcao == 'f') {
		System.out.println("Feminino");
	
}
	else if (opcao == 'M' || opcao == 'm') {
		System.out.println("Masculino");	
	}
	
	else {
		System.out.println("Inválido");
	}
}
}