package vetores;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in);

		double dSomaProduto = 0;

		double dSomaLocal;

		double dBarato    = Double.MAX_VALUE;

		double dCaro      = Double.MIN_VALUE;

		double[][] aMatriz = new double[5][6];

		for(int iLinha = 0; iLinha < 5; iLinha++) {
			System.out.println("Informe o Supermercado "+iLinha);
			dSomaLocal = 0;
			for (int iColuna = 0; iColuna <= 5; iColuna++){
				if (iColuna < 5) {
					System.out.println("Agora Informe o Produto "+iColuna);
					aMatriz[iLinha][iColuna] = oInput.nextDouble();
					dSomaLocal   += aMatriz[iLinha][iColuna];
					dSomaProduto += aMatriz[iLinha][iColuna];
				} 
				else {
					aMatriz[iLinha][iColuna] = dSomaLocal;
					if (aMatriz[iLinha][iColuna] < dBarato || (iLinha == 0 && iColuna == 0)) {
						dBarato = aMatriz[iLinha][iColuna];
					}
					if (aMatriz[iLinha][iColuna] > dCaro || (iLinha == 0 && iColuna==0)) {
						dCaro = aMatriz[iLinha][iColuna];
					}
				}
			}
		}

		for (int iLinha = 0; iLinha < 5; iLinha++) {
			System.out.println("Supermercado "+iLinha+" Precos:");
			for (int iColuna = 0; iColuna <= 5; iColuna++) {
				if (iColuna < 5) {
					System.out.println("R$"+aMatriz[iLinha][iColuna]);
				} else {
					System.out.println("Soma: R$"+aMatriz[iLinha][iColuna]);
				}
			}
		}
		System.out.println("Produto mais caro: "+dCaro);
		System.out.println("Produto mais barato: "+dBarato);
		System.out.println("Soma do preço total dos produtos: R$"+dSomaProduto);



		oInput.close();
	}

}

