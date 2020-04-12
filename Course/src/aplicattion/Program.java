package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employe;

public class Program {
	

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Quantas linhas ter�o na sua matriz? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas ter�o na sua matriz? ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Informe seus numeros:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Qual n�mero voc� quer encontrar? ");
		
		int targed = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			System.out.println();
			for(int j = 0; j < n; j++) {
				if(mat[i][j] == targed) {
					System.out.print("\nPosi��o: " + i + "," + j);
					if(i>0)
					System.out.print("\nSuperior: " + mat[(i-1)][j]);
					if(j>0)
					System.out.print("\nEsquerda: " + mat[i][(j-1)]);
					if(i<(m-1))
					System.out.print("\nInferior: " + mat[(i+1)][j]);
					if(j<(n-1))
					System.out.print("\nDireita: " + mat[i][(j+1)]);
				}
			}
		}
		
		sc.close();
				
	}

}