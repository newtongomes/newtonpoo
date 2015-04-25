/*	Deseja-se calcular o sal�rio l�quido de um grupo de 10 funcion�rios de uma empresa,
 *	e ainda o total a ser pago a estes funcion�rios. Cada funcion�rio deve entrar com sua
 *	matr�cula, nome e o sal�rio bruto. O sal�rio l�quido ser� calculado com um desconto de 6% 
 *	se o sal�rio do funcion�rio for at� R$ 1.500,00 e 9,5% para os sal�rios maiores que esse valor.
 *	Ao final mostrar a lista de todos os funcion�rios com seus dados e o sal�rio l�quido de cada um.
 *	E ainda o total geral a ser pago aos funcion�rios.
 */

package br.estacio.lpr.exercicios.nivel3;

import java.util.Scanner;

public class Funcionarios {
	
	public static void main (String[] args) {
		final int numeroFuncionarios = 10;
		Scanner s = new Scanner (System.in);
		double totalPagar = 0;
		
		int[] matriculas = new int[numeroFuncionarios];
		String[] nomes = new String[numeroFuncionarios];
		double[] salariosBrutos = new double[numeroFuncionarios];
		double[] salariosLiquidos = new double[numeroFuncionarios];
		
		for (int i = 0; i < numeroFuncionarios; i++) {
			System.out.printf("Funcion�rio %d:\n", i + 1);
			
			System.out.printf ("\tDigite a matricula: ");
			matriculas[i] = s.nextInt ();
			
			s.nextLine ();
			
			System.out.printf ("\tDigite o nome: ");
			nomes[i] = s.nextLine ();
			
			System.out.printf("\tDigite o sal�rio bruto: ");
			salariosBrutos[i] = s.nextDouble();
			
			salariosLiquidos[i] = calculaSalario (salariosBrutos[i]);
			totalPagar += salariosLiquidos[i];
		}
		
		System.out.printf ("\n\n");
		
		for (int i = 0; i < numeroFuncionarios; i++) {
			System.out.printf("\nFuncion�rio %d:\n", i + 1);
			
			System.out.printf ("\tMatr�cula: %d\n", matriculas[i]);
			System.out.printf ("\tNome: %s\n", nomes[i]);
			System.out.printf ("\tSal�rio Bruto: %.2f\n", salariosBrutos[i]);
			System.out.printf ("\tSal�rio L�quido: %.2f\n", salariosLiquidos[i]);
		}
		System.out.printf ("\n\nTotal a pagar: %.2f\n", totalPagar);
		s.close ();
		
	} // Fim do m�todo main
	
	static double calculaSalario (double salario) {
		double novoSalario = salario;
		if (salario > 1500.0)
			novoSalario *= 0.905;
		else
			novoSalario *= 0.94;
		
		return novoSalario;
	
	} // Fim do m�todo calculaSalario
	
}
