/* Deseja-se ler o nome e o tempo de profiss�o de um grupo de 10 professores da faculdade, em seguida deve-se mostrar 
 * o tempo m�dio de profiss�o dos professores, e o nome do professor mais antigo da faculdade pelo tempo de profiss�o.
 */

package br.estacio.lpr.exercicios.nivel3;

import java.util.Scanner;

public class Professores {
	
	public static void main (String[] args) {
		final int qtdProfessores = 10;
		Scanner s = new Scanner (System.in);
		double tempoMedio = 0;
		
		String[] nomes = new String[qtdProfessores];
		double[] tempo = new double[qtdProfessores];
		
		for (int i = 0; i < qtdProfessores; i++) {
			System.out.printf ("\nProfessor %d:\n\tDigite o nome do professor: ", i + 1);
			nomes[i] = s.nextLine ();
			
			System.out.printf ("\tDigite o tempo de profiss�o do professor em anos: ");
			tempo[i] = s.nextDouble ();
			
			s.nextLine ();
			
			tempoMedio += tempo[i]/qtdProfessores;
		}
		
		System.out.printf ("Tempo m�dio de profiss�o: %.2f\n", tempoMedio);
		System.out.printf ("Professor mais antigo: %s\n", nomes[maisAntigo (tempo, qtdProfessores)]);
		
		s.close ();
		
	} // Fim do m�todo main
	
	static int maisAntigo (double t[], int qtd) {
		int maior = 0;
		for (int i = 1; i < qtd; i++) {
			if (t[i] > t[maior])
				maior = i;
		}
		return maior;
	
	} // Fim do m�todo maisAntigo
	
} // Fim da classe Professores
