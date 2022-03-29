package activity3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Activity3<Integer> act3 = new Activity3<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list2.add(1);
		ArrayList<Integer>[] array = act3.arrayListas(list, list2);
		System.out.println(array[0]);
		System.out.println(array[1]);

	}

}