package activity10;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
import activity4.ConsoleInput;
import java.util.NoSuchElementException;
public class Stack {
	private Scanner keyboard = new Scanner(System.in);
	private ConsoleInput in = new ConsoleInput(keyboard);
	public void stackManager() {
		boolean exit = false;
		Deque<Byte> deque = new ArrayDeque<>();
		do {
			System.out.println("¿Que acción deseas realizar?\r\n"
					+ "1. Nueva pila\r\n"
					+ "2. Consultar elemento\r\n"
					+ "3. Añadir elemento\r\n"
					+ "4. Eliminar elemento\r\n"
					+ "5. Consultar toda la pila\r\n"
					+ "6. Salir");
		switch(in.readByteInRange((byte)1, (byte)6)) {
		case 1:
			deque.clear();
			break;
		case 2:
			try {
				System.out.println(deque.getLast());
			} catch (NoSuchElementException e) {
				System.out.println("la pila esta vacia");
			}
			break;
		case 3:
				System.out.println("introduce el byte:");
				deque.addLast(in.readByte());
			break;
		case 4:
			try {
				deque.removeLast();
			} catch (NoSuchElementException e) {
				System.out.println("la pila esta vacia");
			}
			break;
		case 5:
			System.out.println(deque.toString());
			break;
		case 6:
			exit = true;
			break;
		}
			
		}while(!exit);
	}
}
