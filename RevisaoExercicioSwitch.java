import java.util.Scanner;

public class RevisaoExercicioSwitch {

	public static void main(String[] args) {

		// questao1();
		// questao2();
		// questao3();
		// questao4();
	}

	public static void questao1() {
		// 1. Crie uma variável chamada “fruta”. Esta variável deve receber uma string
		// com o nome de uma fruta.
		// Após, crie uma estrutura condicional switch que receba esta variável e que
		// possua três casos: caso maçã, retorne no console:
		// “Não vendemos esta fruta aqui”. Caso kiwi, retorne: “Estamos com escassez de
		// kiwis” e caso melancia, retorne:
		// “Aqui está, são 3 reais o quilo”.

		String fruta;

		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Olá bem vindo! Informe a fruta que Desejar.");
		fruta = entradaGeral.nextLine();

		switch (fruta) {
		case "maçã":
			System.out.println("Não vendemos esta fruta aqui!");
			break;
		case "kiwi":
			System.out.println("Estamos com escassez de kiwis!");
			break;
		case "melancia":
			System.out.println("Aqui está, são 3 reais o quilo.");
		default:
			System.out.println("Não trabalhamos com esta fruta.");
			break;
		}
		System.exit(0);
		entradaGeral.close();

	}

	public static void questao2() {
		// 2. Um homem decidiu ir à uma revenda comprar um carro. Ele deseja comprar um
		// carro hatch, e a revenda possui,
		// além de carros hatch, sedans, motocicletas e caminhonetes. Utilizando uma
		// estrutura switch/case, caso o comprador queira o hatch, retorne:
		// “Compra efetuada com sucesso”. Nas outras opções, retorne: “Tem certeza que
		// não prefere este modelo?”.
		// Caso seja especificado um modelo que não está disponível, retorne no console:
		// “Não trabalhamos com este tipo de automóvel aqui”.

		String modelo;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Bem vindo! Por Qual modelo de carro procura? ");
		System.out.println("Hatch | Sedan | Motocicletas | Caminhonetes.");
		modelo = entradaGeral.nextLine();

		switch (modelo) {
		case "hatch":
			System.out.println("Parabéns, compra efetuada com sucesso!");
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
			System.out.println("Não trabalhamos com este tipo de atumóvel aqui.");
			break;
		}
		System.exit(0);
		entradaGeral.close();
	}

	public static void questao3() {
		// 3. Faça um programa que simule uma calculadora, onde informa as opções pro
		// usuário escolher qual operação deseja realizar,
		// e em seguida informe dois números para realizar a operação.
		// Use o case para programar as operações específicas. (soma, subtração,
		// multiplicação e divisão)

		String operacao;
		int soma, subtracao, multiplicacao, divisao, valorUm, valorDois;
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Bem vindo à calculadora!");
		System.out.println("Escolha qual operação deseja!");
		System.out.println("1 para SOMA | 2 para SUBTRAÇÃO | 3 para DIVISÃO | 4 para MULTIPLICAÇÃO");
		operacao = entradaValor.nextLine();
		switch (operacao) {
		case "1":
			System.out.println("Informe o primeiro valor!");
			valorUm = entradaValor.nextInt();
			System.out.println("Informe o segundo valor!");
			valorDois = entradaValor.nextInt();

			soma = valorUm + valorDois;

			System.out.println("O resultado da soma é: " + soma);
			break;
		case "2":
			System.out.println("Informe o primeiro valor!");
			valorUm = entradaValor.nextInt();
			System.out.println("Informe o segundo valor!");
			valorDois = entradaValor.nextInt();

			subtracao = valorUm - valorDois;

			System.out.println("O resultado da soma é: " + subtracao);
			break;
		case "3":
			System.out.println("Informe o primeiro valor!");
			valorUm = entradaValor.nextInt();
			System.out.println("Informe o segundo valor!");
			valorDois = entradaValor.nextInt();

			divisao = valorUm / valorDois;

			System.out.println("O resultado da soma é: " + divisao);
			break;
		case "4":
			System.out.println("Informe o primeiro valor!");
			valorUm = entradaValor.nextInt();
			System.out.println("Informe o segundo valor!");
			valorDois = entradaValor.nextInt();

			multiplicacao = valorUm * valorDois;

			System.out.println("O resultado da soma é: " + multiplicacao);
			break;
		default:
			System.out.println("Operação Inválida.");
			break;
		}
		System.exit(0);
		entradaValor.close();
	}

	public static void questao4() {

		// 4. Faça um programa que mostre opção de Tipos de produtos para o usuário, e
		// após o usuário escolhe o tipo de produto,
		// apresente várias opções.
		// Exemplo:
		// Produtos Não-perecíveis: arroz, feijão, café;
		// Frutas: manga, banana, maçã;
		// Bebidas: leite, sucos, refrigerantes

		int produtoUser;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Bem vindo! Por Qual tipo de produto você procura?");
		System.out.println("1 para Produtos não Perecíveis.");
		System.out.println("2 para Frutas.");
		System.out.println("3 para Bebidas.");
		produtoUser = entradaGeral.nextInt();

		switch (produtoUser) {
		case 1:
			System.out.println("ARROZ | FEIJÃO | CAFÉ");
			break;
		case 2:
			System.out.println("MANGA | BANANA | MAÇÃ");
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
