package activity1;

import java.util.ArrayList;

public class Activity1<T> {

	public ArrayList<T> convertToList(T[] values) {
		ArrayList<T> list = new ArrayList<T>();
		for (int i = 0; i < values.length; i++) {
			list.add(values[i]);
		}
		return list;
	}
}
