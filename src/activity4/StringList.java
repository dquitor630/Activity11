package activity4;

import java.util.ArrayList;
import java.util.Scanner;

public class StringList {
	private ArrayList<String> list = new ArrayList<>();
	private Scanner keyboard = new Scanner(System.in);
	private ConsoleInput input = new ConsoleInput(keyboard);

	public void manageList() {
		boolean exit = false;
		byte command;
		String str;
		int i = 0;
		do {
			System.out.println("Selecciona la acción a realizar \n" + "1. Nueva lista\r\n" + "2. Número de cadenas\r\n"
					+ "3. Añadir cadena\r\n" + "4. Eliminar cadena\r\n" + "5. Contiene cadena\r\n"
					+ "6. Mostrar lista entera\r\n" + "7. Salir\n");
			command = input.readByteInRange((byte) 1, (byte) 7);
			switch (command) {
			case 1:
				list.clear();
				break;
			case 2:
				System.out.println(list.size() + "\n");
				break;
			case 3:
				System.out.println("introduce la cadena que deseas añadir:");
				list.add(input.readString());
				break;
			case 4:
				System.out.println("¿que elemento deseas borrar)");
				i = 0;
				for (String s : list) {
					i = i + 1;
					System.out.println(i + ". " + s);
				}
				System.out.println("\n");
				i = input.readIntLessorEqualThan(list.size());
				list.remove(i - 1);
				break;
			case 5:
				System.out.println("inserta la cadena que quiere comprobar");
				str = input.readString();
				if (list.contains(str)) {
					System.out.println("la cadena existe en la lista\n");
				} else {
					System.out.println("la cadena no existe en la lista\n");
				}
				break;
			case 6:
				i = 0;
				for (String s : list) {
					i = i + 1;
					System.out.println(i + ". " + s);
				}
				System.out.println("\n");
				break;
			case 7:
				exit = true;
				break;
			}

		} while (!exit);
	}
}
