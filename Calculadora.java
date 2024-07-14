package javapoo;

public class Calculadora {
	public static void main(String[] args) {
        CalcularMetodos operacoes = new CalcularMetodos();
        double soma2 = operacoes.somar(2, 3);
        System.out.println(soma2);
        double soma3 = operacoes.somar(1, 2, 3);
        System.out.println(soma3);
        double sub2 = operacoes.subtrair(3, 2);
        System.out.println(sub2);
        double sub3 = operacoes.subtrair(3, 2, 1);
        System.out.println(sub3);
        double mult2 = operacoes.multiplicar(3, 2);
        System.out.println(mult2);
        double mult3 = operacoes.multiplicar(3, 2, 1);
        System.out.println(mult3);
        double div2 = operacoes.dividir(10, 5);
        System.out.println(div2);
        double div3 = operacoes.dividir(10, 5, 1);
        System.out.println(div3);
    }
}
