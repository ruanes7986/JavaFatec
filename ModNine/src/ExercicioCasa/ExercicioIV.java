package ExercicioCasa;

import java.util.Scanner;

public class ExercicioIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		/*
		 * 4) Faça um programa que instancie um array com a entrada via console de 10
		 * disciplinas do curso de ADS. Após a entrada, deve excluir do array as
		 * disciplinas de entrada “impar” (1, 3, 5, 7, 9) e realizar a impressão em
		 * tela, apenas das disciplinas de entrada “par” (2, 4, 6, 8, 10).
		 */

		String disciplinas[] = new String[10];

		for (int index = 0; index < disciplinas.length; index++) {
			System.out.print(index + 1 + ") Insira uma disciplina: ");
			disciplinas[index] = sc.nextLine();
		}

		System.out.println("Array pares:");
		for (int index = 0; index < disciplinas.length; index++) {
			if (index % 2 != 0) {
				System.out.println(disciplinas[index]);
			}
		}

	}

}
