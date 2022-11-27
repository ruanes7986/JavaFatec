package ExercicioCasa;

import java.util.Scanner;

public class ExercicioI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1) Faça um programa, usando array, que tenha como entrada o nome, a idade e o
		 * peso de três pessoas, e que a saída seja da seguinte forma:
		 * 
		 * Jão Zé Tonim
		 * 
		 * Total das idades é: 999 Total dos pesos é: 999.99
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String[] names = new String[3];

		// inserçao dos nomes
		for (int index = 0; index < names.length; index++) {
			System.out.print("Insira um nome: ");
			names[index] = sc.nextLine();
			System.out.println("");
		}

		// inserindo as idades
		int[] age = new int[3];

		for (int index = 0; index < age.length; index++) {
			System.out.print("Insira a idade de " + names[index] + ": ");
			age[index] = sc.nextInt();
			System.out.println("");
		}

		double[] peso = new double[3];

		// inserindo os pesos
		for (int index = 0; index < peso.length; index++) {
			System.out.print("Insira o peso de " + names[index] + ": ");
			peso[index] = sc.nextDouble();
			System.out.println("");
		}

		// impressão dos nomes
		for (int index = 0; index < names.length; index++) {
			System.out.println(names[index]);
		}

		// impressão do total das idades
		int TotalAge = 0;

		for (int index = 0; index < age.length; index++) {
			TotalAge = TotalAge + age[index];
		}
		System.out.println("Total das idades é: " + TotalAge);

		// impressão do total do peso
		double TotalPeso = 0;

		for (int index = 0; index < peso.length; index++) {
			TotalPeso = TotalPeso + peso[index];
		}
		System.out.println("Total dos pessos é : " + TotalPeso);

	}

}
