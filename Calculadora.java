package calculadora;

import java.util.Scanner;

public class Calculadora {
	double vlor1;
	double vlor2;
	double resu;
	Scanner scanf = new Scanner(System.in);

	double adição() {
		System.out.println("Informe o primeiro valor para a soma:");
		this.vlor1 = scanf.nextDouble();
		System.out.println("Informe o segundo valor para a soma:");
		this.vlor2 = scanf.nextDouble();
		resu = this.vlor1 + this.vlor2;
		System.out.println(this.resu);
		return resu;
	}

	double subtração() {
		System.out.println("Informe o primeiro valor para a subtração:");
		this.vlor1 = scanf.nextDouble();
		System.out.println("Informe o segundo valor para a subtração:");
		this.vlor2 = scanf.nextDouble();
		resu = this.vlor1 - this.vlor2;
		System.out.println(this.resu);
		return resu;

	}

	double divisão() {
		System.out.println("Informe o primeiro valor para a divisão:");
		this.vlor1 = scanf.nextDouble();
		System.out.println("Informe o segundo valor para a divisão:");
		this.vlor2 = scanf.nextDouble();
		resu = this.vlor1 / this.vlor2;
		System.out.println(this.resu);
		return resu;

	}

	double multiplicação() {
		System.out.println("Informe o primeiro valor para a multipliçaõ:");
		this.vlor1 = scanf.nextDouble();
		System.out.println("Informe o segundo valor para a multipliçaõ:");
		this.vlor2 = scanf.nextDouble();
		resu = this.vlor1 * this.vlor2;
		System.out.println(this.resu);
		return resu;

	}
}
