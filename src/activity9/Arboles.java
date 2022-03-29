package activity9;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Arboles {

	public static void main(String[] args) {
		Empleado pepe = new Empleado("Pepe", Categoria.EMPLEADO, LocalDate.of(2011, 3, 21), LocalDate.of(2013, 4, 22));
		Empleado juan = new Empleado("Juan", Categoria.ENCARGADO, LocalDate.of(2012, 2, 29), null);
		Empleado maria = new Empleado("María", Categoria.JEFE, LocalDate.of(2010, 4, 30), LocalDate.of(2014, 5, 31));
		Empleado laura = new Empleado("Laura", Categoria.EMPLEADO, LocalDate.of(2010, 12, 30), null);
		Empleado esteban = new Empleado("Esteban", Categoria.ENCARGADO, LocalDate.of(2010, 5, 11),
				LocalDate.of(2015, 2, 11));
		Empleado pedro = new Empleado("Pedro", Categoria.JEFE, LocalDate.of(2009, 8, 16), null);
		Empleado yolanda = new Empleado("Yolanda", Categoria.EMPLEADO, LocalDate.of(2012, 7, 27),
				LocalDate.of(2013, 10, 1));
		Empleado nuria = new Empleado("Nuria", Categoria.JEFE, LocalDate.of(2019, 8, 31), null);
		Empleado antonio = new Empleado("Antonio", Categoria.ENCARGADO, LocalDate.of(2011, 1, 28),
				LocalDate.of(2014, 5, 14));
		Empleado copiaPepe = pepe.copy();
		Empleado copiaEsteban = esteban.copy();
		Empleado copiaPedro = pedro.copy();

		Set<Empleado> set = new LinkedHashSet<>();
		set.add(pepe);
		set.add(juan);
		set.add(maria);
		set.add(laura);
		set.add(esteban);
		set.add(pedro);
		set.add(yolanda);
		set.add(nuria);
		set.add(antonio);
		set.add(copiaPepe);
		set.add(copiaEsteban);
		set.add(copiaPedro);

		SortedSet<Empleado> tree = new TreeSet<>();
		tree.addAll(set);
		SortedSet<Empleado> treeComparator = new TreeSet<>(new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {

				int result = o1.getNombre().compareTo(o2.getNombre());
				return result;
			}
		});
		treeComparator.addAll(set);

		TreeMap<Clave, Empleado> treeMap = new TreeMap<>();
		for (Empleado e : set) {
			treeMap.put(e.getClave(), e);
		}
		for (Empleado e : tree) {
			System.out.println(e);
		}
		System.out.println();

		for (Empleado e : treeComparator) {
			System.out.println(e);
		}
		System.out.println();
		for (Clave c : treeMap.keySet()) {
			System.out.println(treeMap.get(c));
		}
	}

}
