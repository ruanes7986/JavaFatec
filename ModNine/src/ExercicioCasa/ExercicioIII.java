package ExercicioCasa;

public class ExercicioIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3) Faça um programa que instancie um array de 10 posições contendo os números
		 * de 2101 a 2110. O programa deverá somar todos os valores e dividi-los pelo
		 * valor da última posição. Ao final o programa deverá imprimir o array completo
		 * em ordem inversa mais o resultado do cálculo.
		 */

		int Array[] = new int[10];
		int value = 2100;

		// instanciar os valores nas posições
		for (int index = 0; index < Array.length; index++) {
			value = value + 1;
			Array[index] = value;
		}
		// somar todos os valores e divir pela ultima posição

		int totalArray = 0;

		for (int index = 0; index < Array.length; index++) {
			totalArray = totalArray + Array[index];
		}

		System.out.println(
				"A soma de todos os valores, dividido pela ultima posição é : \n" + totalArray / (Array[Array.length - 1]));

		// imprimir o array completo

		System.out.println("Array na ordem crescente:");
		for (int index = 0; index < Array.length; index++) {
			System.out.println(Array[index]);
		}

		// imprimir o array completo na ordem inversa
		System.out.println("Array na ordem decrescente:");

		int index = 9;
		while (index >= 0) {
			System.out.println(Array[index]);
			index = index - 1;
		}

	}

}
