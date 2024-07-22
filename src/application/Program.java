package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// exericioMatriz_somaLinhas
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m, n;
		


		System.out.print("Qual a quantidade de linhas da matriz? ");
		m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		n = sc.nextInt();
		
		double[][] matriz1 = new double[m][n];
		double[] vet = new double[m];
		
		for(int i = 0; i < matriz1.length; i++) {
			System.out.printf("Digite os elementos da %da. linha: \n",i+1);
			for(int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = sc.nextDouble();
				vet[i] += matriz1[i][j];
			}
		}
		
		System.out.println("VETOR GERADO: ");
		for(int i = 0; i < vet.length; i++) {
			System.out.printf("%.1f%n",vet[i]);
		}
		
		sc.close();
	}

}
