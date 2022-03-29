package activity5;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FloatList {

	private ArrayList<Float> list = new ArrayList<>();
	private ListIterator<Float> it;
	private Scanner keyboard = new Scanner(System.in);
	private ConsoleInput input = new ConsoleInput(keyboard);

	public void manageList() {
		boolean exit = false;
		byte command;
		int i = 0;
		it = list.listIterator();
		do {
			System.out.println("Selecciona la acción a realizar: \n" + "1. Mostrar la lista\r\n"
					+ "2. Mostrar siguiente\r\n" + "3. Mostrar anterior\r\n" + "4. Añadir elemento\r\n"
					+ "5. Eliminar el último mostrado\r\n" + "6. Sustituir el último mostrado\r\n" + "7. Salir");
			command = input.readByteInRange((byte) 1, (byte) 7);
			switch (command) {
			case 1:
				for (Float f : list) {
					i = i + 1;
					System.out.println(i + ". " + f);
				}
				i = 0;
				break;
			case 2:
				try {
					if (it.hasNext()) {
						System.out.println(it.next());
					} else {
						it = list.listIterator();
						System.out.println(it.next());
					}
				} catch (NoSuchElementException e) {
					System.out.println("La lista esta vacia");
				}
				break;
			case 3:
				try {
					if (it.hasPrevious()) {
						System.out.println(it.previous());
					} else {
						while (it.hasNext()) {
							if (it.nextIndex() != list.size() - 1) {
								it.next();
							} else {
								System.out.println(it.next());
							}
						}
					}
				} catch (NoSuchElementException e) {
					System.out.println("La lista esta vacia");
				}

				break;
			case 4:
				System.out.println("Introduce el float que desea añadir:");
				it.add(input.readFloat());
				break;
			case 5:
				try {
					it.remove();
				} catch (IllegalStateException e) {
					System.out.println("no se ha mostrado ningún elemento aún");
				}
				it = list.listIterator();
				break;
			case 6:
				try {
					System.out.println("Introduce el float para sustituir este valor:");
					it.set(input.readFloat());
				} catch (IllegalStateException e) {
					System.out.println("no se ha mostrado ningún elemento aún");
				}
				break;
			case 7:
				exit = true;
				break;
			}

		} while (!exit);
	}
}
