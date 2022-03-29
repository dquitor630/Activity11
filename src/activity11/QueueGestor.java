package activity11;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;
import activity4.ConsoleInput;
import java.util.NoSuchElementException;
public class QueueGestor {
	private Scanner keyboard = new Scanner(System.in);
	private ConsoleInput in = new ConsoleInput(keyboard);
	public void queueManager() {
		boolean exit = false;
		Queue<Byte> queue = new ArrayDeque<>();
		do {
			System.out.println("¿Que acción deseas realizar?\r\n"
					+ "1. Nueva cola\r\n"
					+ "2. Consultar elemento\r\n"
					+ "3. Añadir elemento\r\n"
					+ "4. Eliminar elemento\r\n"
					+ "5. Consultar toda la cola\r\n"
					+ "6. Salir");
		switch(in.readByteInRange((byte)1, (byte)6)) {
		case 1:
			queue.clear();
			break;
		case 2:
			try {
				System.out.println(queue.element());
			} catch (NoSuchElementException e) {
				System.out.println("la pila esta vacia");
			}
			break;
		case 3:
				System.out.println("introduce el byte:");
				queue.add(in.readByte());
			break;
		case 4:
			try {
				queue.remove();
			} catch (NoSuchElementException e) {
				System.out.println("la pila esta vacia");
			}
			break;
		case 5:
			System.out.println(queue.toString());
			break;
		case 6:
			exit = true;
			break;
		}
			
		}while(!exit);
	}
}