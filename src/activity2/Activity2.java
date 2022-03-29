package activity2;

import java.util.ArrayList;

public class Activity2<T> {

	public ArrayList<T> invertirLista(ArrayList<T> values) {
		ArrayList<T> list = new ArrayList<T>();
		for (int i = 0; i < values.size(); i++) {
			list.add(values.get(values.size() - (i + 1)));
		}
		return list;
	}

}
