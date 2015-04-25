/* Precisamos armazenar a quantidade de chuva para um determinado m�s do ano, respeitando
 * a quantidade de dias dos meses. Ao final mostrar a precipita��o m�dia de chuva no m�s
 * e o dia que ocorreu a maior chuva. 
 */

package br.estacio.lpr.exercicios.nivel3;

import java.util.Scanner;

public class Precipitacao {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		int numeroMes, qtdDias;
		double mediaChuva = 0;
		
		System.out.printf("Digite o n�mero do m�s: ");
		numeroMes = s.nextInt ();
		
		if (numeroMes <= 7) {
			if (numeroMes == 2)
				qtdDias = 28;
			else {
				if (numeroMes % 2 == 0)
					qtdDias = 30;
				else
					qtdDias = 31;
			}
		} else {
			if (numeroMes % 2 == 0)
				qtdDias = 31;
			else
				qtdDias = 30;
		}
		
		int[] precipitacoes = new int[qtdDias];
		
		for (int i = 0; i < qtdDias; i++) {
			System.out.printf("Digite a precipita��o do dia %d: ", i + 1);
			precipitacoes[i] = s.nextInt ();
			
			mediaChuva += (double)precipitacoes[i]/qtdDias;
		}
		
		System.out.printf("Precipita��o m�dia do m�s: %.2f\n", mediaChuva);
		
		System.out.printf ("A maior chuva o correu no dia: %d\n", maiorChuva (precipitacoes, qtdDias) + 1);
		
		s.close ();
		
	} // Fim do m�todo main
	
	static int maiorChuva (int[] p, int qtdDias) {
		int maior = 0;
		for (int i = 1; i < qtdDias; i++) {
			if (p[i] > p[maior])
				maior = i;
		}
		return maior;
	
	} // Fim do m�todo maiorChuva
	
} // Fim da classe Precipita��o
