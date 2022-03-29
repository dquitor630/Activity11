package activity1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
		ArrayList<Integer> list = new ArrayList<>();
		Activity1<Integer> act1 = new Activity1<>();
		Integer[] array = { 1, 2, 3 };
		list = act1.convertToList(array);
		for (Integer i : list) {
			System.out.printf(" %d ", i);
		}
	}

}
