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

		// 1. Programa em Java que mostra os n�meros �mpares
		// Escreva um aplicativo em Java mostra todos os n�meros �mpares de 1 at� 100.

		int numeros = 1;

		System.out.println("Ser� impresso abaixo, todos os n�meros �mpares entre 1 e 100: ");

		while (numeros < 100) {

			if (!(numeros % 2 == 0)) {
				System.out.println("N�mero �mpar: " + numeros);
			} else {

			}
			numeros++;
		}

		System.exit(0);
	}

	public static void questao2() {

		// 2. Programa em Java que mostra os n�meros pares
		// Escreva um aplicativo em Java mostra todos os n�meros pares de 1 at� 100.

		int numeros = 1;

		System.out.println("Ser� impresso todos os n�meros pares entre 1 e 100: ");

		while (numeros < 100) {
			if (numeros % 2 == 0) {
				System.out.println("N�mero PAR: " + numeros);
			} else {

			}
			numeros++;
		}

		System.exit(0);
	}

	public static void questao3() {

		// 3. Programa em Java que mostra os n�meros pares e �mpares
		// Escreva um aplicativo em Java que recebe inteiro e mostra os n�meros pares e
		// �mpares (separados), de 1 at� esse inteiro.

		int numero, contadorPar = 1, contadorImpar = 1;
		Scanner entradaDados = new Scanner(System.in);

		System.out.println(
				"Informe um n�mero inteiro. O programa ir� mostrar todos os n�meros pares e �mpares entre 1 e o n�mero escolhido.");
		numero = entradaDados.nextInt();

		while (contadorPar <= numero) {
			if (contadorPar % 2 == 0) {
				System.out.println("N�mero Par: " + contadorPar);
			}
			contadorPar++;

		}
		System.out.println("------------------------------------------");
		while (contadorImpar <= numero) {
			if (!(contadorImpar % 2 == 0)) {
				System.out.println("N�mero �mpar: " + contadorImpar);
			}
			contadorImpar++;

		}
		System.exit(0);
		entradaDados.close();
	}

	public static void questao4() {

		// 4. Programa em Java que calcula a m�dia das notas de uma turma
		// Escreva um programa que pergunte ao usu�rio quantos alunos tem na sala dele.
		// Em seguida, atrav�s de um la�o while, pede ao usu�rio para que entre com as
		// notas de todos os alunos da sala, um por vez.

		Double qtdAluno, countAluno = 1.0, somaNotas = 0.0;
		Double notas, media;
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Calcule a m�dia da sua turma!");
		System.out.println("Quantos Alunos Tem em sua turma? ");
		qtdAluno = entradaDados.nextDouble();

		while (countAluno <= qtdAluno) {
			System.out.println("Informe a nota do Aluno: ");
			notas = entradaDados.nextDouble();
			somaNotas += notas;
			countAluno++;
		}

		media = somaNotas / qtdAluno;

		System.out.println("A m�dia da Turma �: " + media);

		System.exit(0);
		entradaDados.close();
	}

	public static void questao5() {

		// 5. Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do
		// outro.
		// Depois modifique o programa para que ele mostre os n�meros um ao lado do
		// outro.

		int count = 1, count2 = 1;

		System.out.println("N�meros de 1 a 20");

		System.out.println("N�meros um abaixo do Outro: ");
		while (count <= 20) {
			System.out.println(count);
			count++;
		}

		System.out.println("----------------------------------------------");
		System.out.println("N�meros um ao lado do outro: ");
		while (count2 <= 20) {
			System.out.print("|" + count2 + "|");
			count2++;
		}
		System.exit(0);

	}

	public static void questao6() {

		// 6. Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
		// obtemos resto = 5.

		int contador = 1000;

		System.out.println("N�meros entre 1000 e 1999 que dividos por 11 temos resto 5. ");

		while (contador < 2000) {
			if (contador % 11 == 5) {
				System.out.println("|" + contador + "|");
			}
			contador++;
		}
		System.exit(0);
	}

	
}
