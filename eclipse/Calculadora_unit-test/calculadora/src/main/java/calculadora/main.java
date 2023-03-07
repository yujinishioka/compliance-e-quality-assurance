package calculadora;
import java.util.Scanner;

public class main {
	
	static int valor1;
	static int valor2;
	static int resultado;
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		int opcao;
		String menu = "Calculadora\n\n"+
						"1 - somar\n" +
						"2 - subtrair\n" +
						"3 - multiplicar\n" +
						"4 - dividir\n";
		
		System.out.println(menu);
		System.out.println("Selecione a operacao: ");
		opcao = ler.nextInt();
		System.out.println("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		
		switch (opcao) {
			case 1:
				resultado = calc.somar(valor1, valor2);
				System.out.println("O resultado da soma de "+ valor1 + " e " + valor2 + " eh: " + resultado);
				break;
			case 2:
				resultado = calc.subtrair(valor1, valor2);
				System.out.println("O resultado da subtracao de "+ valor2 + " de " + valor1 + " eh: " + resultado);
				break;
			case 3:
				resultado = calc.multiplicar(valor1, valor2);
				System.out.println("O resultado da multiplicação de "+ valor1 + " por " + valor2 + " eh: " + resultado);
				break;
			case 4:
				resultado = calc.dividir(valor1, valor2);
				System.out.println("O resultado da divisao de "+ valor1 + " por " + valor2 + " eh: " + resultado);
				break;
		}
				
	}

}
