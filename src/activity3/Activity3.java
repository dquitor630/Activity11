package activity3;

import java.util.ArrayList;

public class Activity3<T> {
	public ArrayList<T>[] arrayListas(ArrayList<T> list1, ArrayList<T> list2) {
		@SuppressWarnings("unchecked")
		ArrayList<T>[] list = new ArrayList[2];
		list[0] = list1;
		list[1] = list2;
		return list;

	}
}
