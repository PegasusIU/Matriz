package vetores;
import java.util.Scanner;

public class Ex4 {
	public static void main(String args[]) {
		Scanner oInput = new Scanner(System.in);

		int iTamanho = 0;

		int iSomaElementos = 0;

		int iPares = 0;

		int iImpares = 0;


		while ((iTamanho < 3 && iTamanho > 11) || iTamanho % 2 == 0) {
			System.out.print("Informe o tamanho da Matriz: ");
			iTamanho = oInput.nextInt();
		}

		int[][] aMatriz = new int[iTamanho][iTamanho];


		for(int iLinha = 0; iLinha < iTamanho; iLinha++) {
			for (int iColuna = 0; iColuna < iTamanho; iColuna++) {
				System.out.print("["+iLinha+"]["+iColuna+"] Informe o valor: ");
				aMatriz[iLinha][iColuna] = oInput.nextInt();
			}
			System.out.println("");
		}

		int iPosicaoDiagonaPrincipal = 0;

		int iPosicaoDiagonaSecudaria = iTamanho - 1;

		int iSomaDiagonaPrincipal   = 0;
		int iSomaDiagonalSecundaria = 0;

		int iMenor = 0;
		int iMaior = 0;

		for (int iLinha = 0; iLinha < iTamanho; iLinha++) {
			for (int iColuna = 0; iColuna < iTamanho; iColuna++) {
				System.out.print(aMatriz[iLinha][iColuna]);

				iSomaElementos += aMatriz[iLinha][iColuna];

				if (aMatriz[iLinha][iColuna] % 2 == 0) {
					iPares += aMatriz[iLinha][iColuna];
				} 
				else {
					iImpares += aMatriz[iLinha][iColuna];
				}

				if (iColuna == iPosicaoDiagonaPrincipal) {
					iSomaDiagonaPrincipal += aMatriz[iLinha][iColuna];
				}

				if (iLinha == iPosicaoDiagonaSecudaria) {
					iSomaDiagonalSecundaria += aMatriz[iLinha][iColuna];
				}

				if (aMatriz[iLinha][iColuna] < iMenor || (iLinha == 0 && iColuna == 0)) {
					iMenor = aMatriz[iLinha][iColuna];
				}

				if (aMatriz[iLinha][iColuna] > iMaior || (iLinha == 0 && iColuna == 0)) {
					iMaior = aMatriz[iLinha][iColuna];
				}
			}
			iPosicaoDiagonaPrincipal += 1;
			iPosicaoDiagonaSecudaria -= 1;
		}

		double dMedia = (iSomaElementos/(Math.pow(iTamanho, 2)));

		System.out.print("");
		System.out.println(" Soma da Diagonal Principal: "+iSomaDiagonaPrincipal);
		System.out.println(" Soma da Diagonal Secundaria: "+iSomaDiagonalSecundaria);
		System.out.println(" Soma dos Elementos: "+iSomaElementos);
		System.out.println(" Media: "+dMedia);
		System.out.print(" Menor Elemento: "+iMenor+" Maior Elemento: "+iMaior);
		System.out.print(" Soma dos pares: "+iPares+" Soma dos impares: "+iImpares);

		oInput.close();
	}	
}

