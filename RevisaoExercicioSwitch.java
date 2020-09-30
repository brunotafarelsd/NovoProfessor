import java.util.Scanner;

public class RevisaoExercicioSwitch {

	public static void main(String[] args) {

		// questao1();
		// questao2();
		// questao3();
		// questao4();
	}

	public static void questao1() {
		// 1. Crie uma vari�vel chamada �fruta�. Esta vari�vel deve receber uma string
		// com o nome de uma fruta.
		// Ap�s, crie uma estrutura condicional switch que receba esta vari�vel e que
		// possua tr�s casos: caso ma��, retorne no console:
		// �N�o vendemos esta fruta aqui�. Caso kiwi, retorne: �Estamos com escassez de
		// kiwis� e caso melancia, retorne:
		// �Aqui est�, s�o 3 reais o quilo�.

		String fruta;

		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Ol� bem vindo! Informe a fruta que Desejar.");
		fruta = entradaGeral.nextLine();

		switch (fruta) {
		case "ma��":
			System.out.println("N�o vendemos esta fruta aqui!");
			break;
		case "kiwi":
			System.out.println("Estamos com escassez de kiwis!");
			break;
		case "melancia":
			System.out.println("Aqui est�, s�o 3 reais o quilo.");
		default:
			System.out.println("N�o trabalhamos com esta fruta.");
			break;
		}
		System.exit(0);
		entradaGeral.close();

	}

	public static void questao2() {
		// 2. Um homem decidiu ir � uma revenda comprar um carro. Ele deseja comprar um
		// carro hatch, e a revenda possui,
		// al�m de carros hatch, sedans, motocicletas e caminhonetes. Utilizando uma
		// estrutura switch/case, caso o comprador queira o hatch, retorne:
		// �Compra efetuada com sucesso�. Nas outras op��es, retorne: �Tem certeza que
		// n�o prefere este modelo?�.
		// Caso seja especificado um modelo que n�o est� dispon�vel, retorne no console:
		// �N�o trabalhamos com este tipo de autom�vel aqui�.

		String modelo;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Bem vindo! Por Qual modelo de carro procura? ");
		System.out.println("Hatch | Sedan | Motocicletas | Caminhonetes.");
		modelo = entradaGeral.nextLine();

		switch (modelo) {
		case "hatch":
			System.out.println("Parab�ns, compra efetuada com sucesso!");
			break;
		case "sedan":
			System.out.println("Tem certeza que prefere este modelo?");
			break;
		case "motocicletas":
			System.out.println("Tem certeza que prefere este modelo?");
			break;
		case "caminhonete":
			System.out.println("Tem certeza que prefere este modelo?");
			break;
		default:
			System.out.println("N�o trabalhamos com este tipo de atum�vel aqui.");
			break;
		}
		System.exit(0);
		entradaGeral.close();
	}

	public static void questao3() {
		// 3. Fa�a um programa que simule uma calculadora, onde informa as op��es pro
		// usu�rio escolher qual opera��o deseja realizar,
		// e em seguida informe dois n�meros para realizar a opera��o.
		// Use o case para programar as opera��es espec�ficas. (soma, subtra��o,
		// multiplica��o e divis�o)

		String operacao;
		int soma, subtracao, multiplicacao, divisao, valorUm, valorDois;
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Bem vindo � calculadora!");
		System.out.println("Escolha qual opera��o deseja!");
		System.out.println("1 para SOMA | 2 para SUBTRA��O | 3 para DIVIS�O | 4 para MULTIPLICA��O");
		operacao = entradaValor.nextLine();
		switch (operacao) {
		case "1":
			System.out.println("Informe o primeiro valor!");
			valorUm = entradaValor.nextInt();
			System.out.println("Informe o segundo valor!");
			valorDois = entradaValor.nextInt();

			soma = valorUm + valorDois;

			System.out.println("O resultado da soma �: " + soma);
			break;
		case "2":
			System.out.println("Informe o primeiro valor!");
			valorUm = entradaValor.nextInt();
			System.out.println("Informe o segundo valor!");
			valorDois = entradaValor.nextInt();

			subtracao = valorUm - valorDois;

			System.out.println("O resultado da soma �: " + subtracao);
			break;
		case "3":
			System.out.println("Informe o primeiro valor!");
			valorUm = entradaValor.nextInt();
			System.out.println("Informe o segundo valor!");
			valorDois = entradaValor.nextInt();

			divisao = valorUm / valorDois;

			System.out.println("O resultado da soma �: " + divisao);
			break;
		case "4":
			System.out.println("Informe o primeiro valor!");
			valorUm = entradaValor.nextInt();
			System.out.println("Informe o segundo valor!");
			valorDois = entradaValor.nextInt();

			multiplicacao = valorUm * valorDois;

			System.out.println("O resultado da soma �: " + multiplicacao);
			break;
		default:
			System.out.println("Opera��o Inv�lida.");
			break;
		}
		System.exit(0);
		entradaValor.close();
	}

	public static void questao4() {

		// 4. Fa�a um programa que mostre op��o de Tipos de produtos para o usu�rio, e
		// ap�s o usu�rio escolhe o tipo de produto,
		// apresente v�rias op��es.
		// Exemplo:
		// Produtos N�o-perec�veis: arroz, feij�o, caf�;
		// Frutas: manga, banana, ma��;
		// Bebidas: leite, sucos, refrigerantes

		int produtoUser;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Bem vindo! Por Qual tipo de produto voc� procura?");
		System.out.println("1 para Produtos n�o Perec�veis.");
		System.out.println("2 para Frutas.");
		System.out.println("3 para Bebidas.");
		produtoUser = entradaGeral.nextInt();

		switch (produtoUser) {
		case 1:
			System.out.println("ARROZ | FEIJ�O | CAF�");
			break;
		case 2:
			System.out.println("MANGA | BANANA | MA��");
			break;
		case 3:
			System.out.println("LEITE | SUCOS | REFRIGERANTES");
			break;
		default:
			break;
		}
		System.exit(0);
		entradaGeral.close();
	}

}
