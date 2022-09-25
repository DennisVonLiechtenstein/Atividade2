package calculadora;

import java.util.Scanner;

public class Do {

	public static void main(String[] args) {
		int op;
		Scanner scanf = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		System.out.println("Digite 1 para somar:\n 2 para subtrair:\n 3 para dividir:\n 4 para multiplicar:");
		op = scanf.nextInt();
		if(op>=1 && op<=4) {
		if (op == 1) {
			calc.adição();
		}else if(op==2) {
			calc.subtração();
			
		}else if(op==3) {
			calc.divisão();
		}else if(op==4) {
			calc.multiplicação();
		}

	}else {
		System.out.println("Voce nao digitou a opcao correspondente corretamente!");
	}
	}

}
