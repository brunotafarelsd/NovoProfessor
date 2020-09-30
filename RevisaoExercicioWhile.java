import java.util.Scanner;

public class RevisaoExercicioWhile {

	public static void main(String[] args) {

		// questao1();
		// questao2();
		// questao3();
		// questao4();
		// questao5();
		// questao6();
	}

	public static void questao1() {

		// 1. Programa em Java que mostra os números ímpares
		// Escreva um aplicativo em Java mostra todos os números ímpares de 1 até 100.

		int numeros = 1;

		System.out.println("Será impresso abaixo, todos os números ímpares entre 1 e 100: ");

		while (numeros < 100) {

			if (!(numeros % 2 == 0)) {
				System.out.println("Número Ímpar: " + numeros);
			} else {

			}
			numeros++;
		}

		System.exit(0);
	}

	public static void questao2() {

		// 2. Programa em Java que mostra os números pares
		// Escreva um aplicativo em Java mostra todos os números pares de 1 até 100.

		int numeros = 1;

		System.out.println("Será impresso todos os números pares entre 1 e 100: ");

		while (numeros < 100) {
			if (numeros % 2 == 0) {
				System.out.println("Número PAR: " + numeros);
			} else {

			}
			numeros++;
		}

		System.exit(0);
	}

	public static void questao3() {

		// 3. Programa em Java que mostra os números pares e ímpares
		// Escreva um aplicativo em Java que recebe inteiro e mostra os números pares e
		// ímpares (separados), de 1 até esse inteiro.

		int numero, contadorPar = 1, contadorImpar = 1;
		Scanner entradaDados = new Scanner(System.in);

		System.out.println(
				"Informe um número inteiro. O programa irá mostrar todos os números pares e ímpares entre 1 e o número escolhido.");
		numero = entradaDados.nextInt();

		while (contadorPar <= numero) {
			if (contadorPar % 2 == 0) {
				System.out.println("Número Par: " + contadorPar);
			}
			contadorPar++;

		}
		System.out.println("------------------------------------------");
		while (contadorImpar <= numero) {
			if (!(contadorImpar % 2 == 0)) {
				System.out.println("Número Ímpar: " + contadorImpar);
			}
			contadorImpar++;

		}
		System.exit(0);
		entradaDados.close();
	}

	public static void questao4() {

		// 4. Programa em Java que calcula a média das notas de uma turma
		// Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
		// Em seguida, através de um laço while, pede ao usuário para que entre com as
		// notas de todos os alunos da sala, um por vez.

		Double qtdAluno, countAluno = 1.0, somaNotas = 0.0;
		Double notas, media;
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Calcule a média da sua turma!");
		System.out.println("Quantos Alunos Tem em sua turma? ");
		qtdAluno = entradaDados.nextDouble();

		while (countAluno <= qtdAluno) {
			System.out.println("Informe a nota do Aluno: ");
			notas = entradaDados.nextDouble();
			somaNotas += notas;
			countAluno++;
		}

		media = somaNotas / qtdAluno;

		System.out.println("A média da Turma é: " + media);

		System.exit(0);
		entradaDados.close();
	}

	public static void questao5() {

		// 5. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do
		// outro.
		// Depois modifique o programa para que ele mostre os números um ao lado do
		// outro.

		int count = 1, count2 = 1;

		System.out.println("Números de 1 a 20");

		System.out.println("Números um abaixo do Outro: ");
		while (count <= 20) {
			System.out.println(count);
			count++;
		}

		System.out.println("----------------------------------------------");
		System.out.println("Números um ao lado do outro: ");
		while (count2 <= 20) {
			System.out.print("|" + count2 + "|");
			count2++;
		}
		System.exit(0);

	}

	public static void questao6() {

		// 6. Informar todos os números de 1000 a 1999 que quando divididos por 11
		// obtemos resto = 5.

		int contador = 1000;

		System.out.println("Números entre 1000 e 1999 que dividos por 11 temos resto 5. ");

		while (contador < 2000) {
			if (contador % 11 == 5) {
				System.out.println("|" + contador + "|");
			}
			contador++;
		}
		System.exit(0);
	}

	
}
