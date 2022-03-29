package activity2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
		ArrayList<Integer> list = new ArrayList<>();
		Activity2<Integer> act2 = new Activity2<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list = act2.invertirLista(list);
		System.out.println(list.toString());

	}

}
