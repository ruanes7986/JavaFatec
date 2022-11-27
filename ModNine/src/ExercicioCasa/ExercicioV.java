package ExercicioCasa;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList<String> names;
		names = new ArrayList();

		names.add("Amarelo");
		names.add("Branco");
		names.add("Ciano");
		names.add("Dourado");
		names.add("Lilas");

		names.add(2, (sc.nextLine()));
		names.add(4, (sc.nextLine()));
		names.add(6, (sc.nextLine()));

		System.out.println(names);

	}

}
