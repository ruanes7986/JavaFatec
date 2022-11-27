package ExercicioCasa;

public class ExercicioII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2) Faça um programa que declare uma matriz unidimensional com 100 posições.
		 * Cada posição deverá ser alimentada com os número de 1 a 100. A seguir, some
		 * todos os números contidos em cada elemento do array. Finalmente, o programa
		 * deverá imprimir o conteúdo de cada posição do array e também o resultado
		 * total da soma de valores.
		 */

		int matriz[] = new int[100];

		for (int index = 0; index < matriz.length; index++) {
			matriz[index] = index + 1;
		}

		// imprimir todos os elementos

		for (int index = 0; index < matriz.length; index++) {
			System.out.println(matriz[index]);
		}

		// soma de todos os elementos da Array
		int totalMatriz = 0;

		for (int index = 0; index < matriz.length; index++) {
			totalMatriz = totalMatriz + matriz[index];
		}
		System.out.println("A Soma de 1 até 100 é :" + totalMatriz);
	}

}
