import java.util.Scanner;

public class ExercicioRevisaoIf {

	public static void main(String[] args) {

		// questao1();
		// questao2();
		// questao3();
		// questao4();
		// questao5();
		// questao6();
		// questao7();
		// questao8();
		// questao9();
		// questao10();
		// questao11();
		// questao12();
		// questao13();
	}

	public static void questao1() {
		//// Fa�a um programa que receba 2 valores e retorne o maior entre eles.
		int valorUm, valorDois;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Digite dois valores e descubra qual o maior entre eles.");
		System.out.println("Digite o primeiro valor: ");
		valorUm = entradaGeral.nextInt();
		System.out.println("Digite o Segundo Valor: ");
		valorDois = entradaGeral.nextInt();

		if (valorUm > valorDois) {
			System.out.println("O valor maior �: " + valorUm);
		} else if (valorDois > valorUm) {
			System.out.println("O valor maior �: " + valorDois);
		} else {
			System.out.println("Os valores s�o iguais.");
		}
		System.exit(0);
		entradaGeral.close();
	}

	public static void questao2() {
		// Fa�a um programa que receba 4 valores e retorne o menor entre eles.

		int valorUm, valorDois, valorTres, valorQuatro;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Informe 4 valores e descubra qual o menor entre eles.");
		System.out.println("Informe o primeiro valor: ");
		valorUm = entradaGeral.nextInt();
		System.out.println("Informe o segundo valor: ");
		valorDois = entradaGeral.nextInt();
		System.out.println("Informe o terceiro valor: ");
		valorTres = entradaGeral.nextInt();
		System.out.println("Informe o quarto valor: ");
		valorQuatro = entradaGeral.nextInt();

		if ((valorUm < valorDois) && (valorUm < valorTres) && (valorUm < valorQuatro)) {
			System.out.println("O menor n�mero informado �: " + valorUm);
		}
		if ((valorDois < valorUm) && (valorDois < valorTres) && (valorDois < valorQuatro)) {
			System.out.println("O menor n�mero informado �: " + valorDois);
		}
		if ((valorTres < valorUm) && (valorTres < valorDois) && (valorTres < valorQuatro)) {
			System.out.println("O menor n�mero informado �: " + valorTres);
		}
		if ((valorQuatro < valorUm) && (valorQuatro < valorDois) && (valorQuatro < valorTres)) {
			System.out.println("O menor n�mero informado �: " + valorQuatro);
		} else {

		}
		System.exit(0);
		entradaGeral.close();
	}

	public static void questao3() {
		// Fa�a um programa que verifique se um n�mero � �mpar.

		int valor;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Informe um valor e saiba se ele � �mpar.");
		valor = entradaGeral.nextInt();

		if (!(valor % 2 == 0)) {
			System.out.println("O valor informado � �mpar.");
		} else {
			System.out.println("O valor informado � par.");
		}
		System.exit(0);
		entradaGeral.close();
	}

	public static void questao4() {
		// Fazer um programa que retorne o nome de um produto a partir do c�digo do
		// mesmo. Considere os seguintes c�digos.
		// 001 - Arroz; 002 - Feij�o; 003 - Farinha; outro c�digo - diversos;

		int codigoProduto;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Bem vindo! Temos estes produtos para sua escolha: ");
		System.out.println("001 - Arroz");
		System.out.println("002 - Feij�o");
		System.out.println("003 - Farinha");
		System.out.println("Digite o c�digo do produto que deseja.");
		codigoProduto = entradaGeral.nextInt();

		if (codigoProduto == 001) {
			System.out.println("O produto escolhido foi: Arroz");
		} else if (codigoProduto == 002) {
			System.out.println("O produto escolhido foi: Feij�o");
		} else if (codigoProduto == 003) {
			System.out.println("O produto escolhido foi: Farinha");
		} else {
			System.out.println("Diversos.");
		}
		System.exit(0);
		entradaGeral.close();
	}

	public static void questao5() {
		// Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
		// mensagem que diga se ela poder�
		// ou n�o votar este ano(n�o � necess�rio considerar o m�s).

		int anoNascimento;
		int anoAtual = 2020;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Bem vindo! Informe seu ano de nascimento e Saiba se voc� poder� votar ou n�o.");
		anoNascimento = entradaGeral.nextInt();

		int idade = anoAtual - anoNascimento;

		if (idade >= 70) {
			System.out.println("Voc� poder� votar, por�m seu voto n�o � mais obrigat�rio.");
		} else if (idade >= 18) {
			System.out.println("Voc� poder� votar e seu voto � obrigat�rio.");
		} else if (idade >= 16) {
			System.out.println("Voc� poder� votar, por�m seu voto ainda n�o � obrigat�rio.");
		} else {
			System.out.println("Voc� ainda n�o pode votar.");
		}
		System.exit(0);
		entradaGeral.close();
	}

	public static void questao6() {
		// Escreva um programa que verifique a validade de uma senha fornecida pelo
		// usu�rio
		// A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes mensagens:
		// ACESSO PERMITIDO para senha v�lida. ACESSO NEGADO para senha inv�lida.

		int senha;
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Bem vindo usu�rio. Digite sua Senha para ter Acesso a sua conta.");
		senha = entradaDados.nextInt();

		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO!");
		} else {
			System.out.println("ACESSO NEGADO!");
		}
		System.exit(0);
		entradaDados.close();
	}

	public static void questao7() {
		// As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$
		// 0,25 se forem compradas pelo menos doze.
		// Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o
		// valor total da compra.

		Double qtdFrutas, multiplicacao;
		Double valorFrutas;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Bem vindo! Quantas ma��s voc� deseja comprar?");
		qtdFrutas = entradaGeral.nextDouble();

		if (qtdFrutas <= 12) {
			valorFrutas = 0.30;
		} else {
			valorFrutas = 0.25;
		}

		multiplicacao = valorFrutas * qtdFrutas;

		System.out.println(
				"Voc� comprou " + qtdFrutas + " ma��s. O valor total da sua compra foi de: R$" + multiplicacao);

		System.exit(0);
		entradaGeral.close();
	}

	public static void questao8() {
		// Escreva um programa para ler 3 valores inteiros(considere que n�o ser� lidos
		// valores iguais)
		// e escreve-los em ordem crscente.

		int valorUm, valorDois, valorTres;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Informe 3 valores e o programa ir� orden�-los em ordem crescente.");
		System.out.println("Primeiro Valor: ");
		valorUm = entradaGeral.nextInt();
		System.out.println("Segundo Valor: ");
		valorDois = entradaGeral.nextInt();
		System.out.println("Terceiro Valor:");
		valorTres = entradaGeral.nextInt();

		if ((valorUm < valorDois) && (valorDois < valorTres)) {
			System.out.println("1� - " + valorUm + "| 2� - " + valorDois + "| 3� - " + valorTres);
		} else if ((valorUm < valorTres) && (valorTres < valorDois)) {
			System.out.println("1� - " + valorUm + "| 2� - " + valorTres + "| 3� - " + valorDois);
		} else if ((valorDois < valorTres) && (valorTres < valorUm)) {
			System.out.println("1� - " + valorDois + "| 2� - " + valorTres + "| 3� - " + valorUm);
		} else if ((valorDois < valorUm) && (valorUm < valorTres)) {
			System.out.println(("1� - " + valorDois + "| 2� - " + valorUm + "| 3� - " + valorTres));
		} else if ((valorTres < valorDois) && (valorDois < valorUm)) {
			System.out.println("1� - " + valorTres + "| 2� - " + valorDois + "| 3� - " + valorUm);
		} else if ((valorTres < valorUm) && (valorUm < valorDois)) {
			System.out.println("1� - " + valorTres + "| 2� - " + valorUm + "| 3� - " + valorDois);
		}
		System.exit(0);
		entradaGeral.close();
	}

	public static void questao9() {
		// homens - (72,7 * Altura) - 58
		// mulheres - (62,1 * Altura) - 44,7

		Double altura = 0.0;
		Double peso = 0.0;
		String sexo = "";
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println("Bem vindo! Saiba qual o peso ideal conforme seu sexo e altura.");
		System.out.println("Informe seu Sexo: M para Masculino ou F para Feminino ");
		sexo = entradaGeral.nextLine();
		System.out.println("Informe a Sua Altura");
		altura = entradaGeral.nextDouble();

		if (sexo.equalsIgnoreCase("M")) {
			peso = ((72.7 * altura) - 58);
			System.out.println("Seu peso ideal �: " + peso);
		} else if (sexo.equalsIgnoreCase("F")) {
			peso = ((62.1 * altura) - 44.7);
			System.out.println("Seu peso ideal �: " + peso);
		}

		System.exit(0);
		entradaGeral.close();
	}

	public static void questao10() {
		//Pol�gonos
		
		Double lados, base, altura;
		Double area;
		Scanner entradaGeral = new Scanner(System.in);

		System.out.println(
				"Descubra qual o tipo do pol�gono e sua �rea, informando quantos lados e a medida de cada lado.");
		System.out.println("Informe quantos lados sua forma geom�trica tem: ");
		lados = entradaGeral.nextDouble();

		if (lados == 3) {
			System.out.println("Informa a base em CM:");
			base = entradaGeral.nextDouble();
			System.out.println("Informa a altura em CM:");
			altura = entradaGeral.nextDouble();
			area = (base * altura) / 2;
			System.out.println("Este pol�gono � um TRIANGULO e sua �rea �: " + area + " cm");
		} else if (lados == 4) {
			System.out.println("Informe a base em CM: ");
			base = entradaGeral.nextDouble();
			System.out.println("Informe a Altura em CM");
			altura = entradaGeral.nextDouble();
			area = base * altura;
			System.out.println("Este pol�gono � um QUADRADO e sua �rea �: " + area + " cm");
		} else if (lados == 5) {
			System.out.println("Este pol�gono � um PENT�GONO.");

		} else if (lados < 3) {
			System.out.println("Este N�O � UM POL�GONO!");
		} else {
			System.out.println("POL�GONO N�O IDENTIFICADO!");
		}
		System.exit(0);
		entradaGeral.close();
	}


}
