package basico1;
import java.util.Scanner;

public class exercicio03 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um número: ");
	int num1 = entrada.nextInt ();
	System.out.println("Digite outro número: ");
	int num2 = entrada.nextInt ();
	System.out.println("Digite outro número: ");
	int num3 = entrada.nextInt ();
	if (num1 > num2 && num1 > num3) {
		System.out.println(num1);
	}
	else if (num2 > num1 && num2 > num3) {
		System.out.println(num2);
	}
	else {
		System.out.println(num3);
	}

}
}
