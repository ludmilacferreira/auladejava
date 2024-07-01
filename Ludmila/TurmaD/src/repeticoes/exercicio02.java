package repeticoes;
import java.util.Scanner;

public class exercicio02 {
public static void main(String[] args) {
	int numAlunos = 0;
	double soma=0, notas = 0, media =0;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Quantos alunos tem na sala? ");
	numAlunos = entrada.nextInt ();
	while (numAlunos>0) {
	System.out.println("Digite as notas: ");
	notas = entrada.nextDouble();
	soma +=notas;
	numAlunos = numAlunos - 1;
	}
	media = soma/numAlunos;
	System.out.println(media);
}
}
