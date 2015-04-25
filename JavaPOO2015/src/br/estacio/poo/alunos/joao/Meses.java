/* Deve-se ler um n�mero inteiro correspondente ao n�mero do m�s do ano (1 a 12) em seguida
 * mostrar o nome do m�s com a quantidade de dias que o m�s tem (28,28,30 ou 21). Perguntar 
 * ao usu�rio se deseja executar o programa novamente, caso a resposta seja "sim" repetir
 * o programa, caso contr�rio, finalizar. */

package br.estacio.lpr.exercicios.nivel3;

import java.util.Scanner;

public class Meses {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		int numeroMes;
		String opcao;
		
		do {
			System.out.printf ("\n\nDigite o n�mero do m�s: ");
			numeroMes = s.nextInt ();
			
			menu (numeroMes);
			
			s.nextLine ();
			System.out.printf ("\n\nDeseja continuar?\nSIM para continuar.\n>>> ");
			opcao = s.nextLine ();
		} while (opcao == "SIM");
		System.out.print ("Programa Finalizado!\n");
		s.close ();
		
	} // Fim m�todo main
	
	static void menu (int numeroMes) {
		int qtdDias = 0;
		String nomeMes = null;
		
		switch (numeroMes) {
			case 1:
				nomeMes = "Janeiro";
				qtdDias = 31;
				break;
			case 2:
				nomeMes = "Fevereiro";
				qtdDias = 28;
				break;
			case 3:
				nomeMes = "Mar�o";
				qtdDias = 31;
				break;
			case 4:
				nomeMes = "Abril";
				qtdDias = 30;
				break;
			case 5:
				nomeMes = "Maio";
				qtdDias = 31;
				break;
			case 6:
				nomeMes = "Junho";
				qtdDias = 30;
				break;
			case 7:
				nomeMes = "Julho";
				qtdDias = 31;
				break;
			case 8:
				nomeMes = "Agosto";
				qtdDias = 31;
				break;
			case 9: 
				nomeMes = "Setembro";
				qtdDias = 30;
				break;
			case 10:
				nomeMes = "Outubro";
				qtdDias = 31;
				break;
			case 11:
				nomeMes = "Novembro";
				qtdDias = 30;
				break;
			case 12:
				nomeMes = "Dezembro";
				qtdDias = 31;
				break;
			default:
				System.out.printf ("M�s inv�lido.\n");
		}
		if (numeroMes <= 12 && numeroMes >=1) {
			System.out.printf ("Nome do m�s: %s\n", nomeMes);
			System.out.printf ("Quantidade de dias: %d\n", qtdDias);
		} 
	
	} // Fim do m�todo menu

} // Fim da classe Meses
