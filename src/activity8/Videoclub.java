package activity8;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.TreeSet;

public class Videoclub {
	public static void main(String[] args) {
		new Videoclub().prueba();
	}
	
	
	
	public void prueba() {
		Pelicula poltergeist = new Pelicula("Poltergeist, juegos diabólicos", Genero.TERROR, LocalDate.of(2015, 5, 22), LocalDate.of(2015, 5, 22));
		Pelicula cumbre = new Pelicula("La cumbre escarlata", Genero.TERROR, LocalDate.of(2015, 10, 9), LocalDate.of(2016, 2, 12));
		Pelicula apellidos = new Pelicula("Ocho apellidos catalanes", Genero.COMEDIA, LocalDate.of(2015, 11, 20), LocalDate.of(2016, 3, 18));
		Pelicula padres = new Pelicula("Padres por desigual", Genero.COMEDIA, LocalDate.of(2016, 1, 01), LocalDate.of(2016, 05, 11));
		Pelicula star = new Pelicula("Star Wars: El despertar de la Fuerza", Genero.FICCION, LocalDate.of(2015, 12, 18), LocalDate.of(2016, 4, 20));
		Pelicula mad = new Pelicula("Mad Max: Furia en la carretera", Genero.FICCION, LocalDate.of(2015, 5, 15), LocalDate.of(2015, 9, 01));
		Pelicula poltergeistCopy = poltergeist.copy();
		Pelicula starCopy = star.copy();
		Set<Pelicula> set = new LinkedHashSet<>();
		set.add(poltergeist);
		set.add(cumbre);
		set.add(apellidos);
		set.add(padres);
		set.add(star);
		set.add(mad);
		set.add(poltergeistCopy);
		set.add(starCopy);
		
		TreeSet<Pelicula> tree = new TreeSet<>();
		tree.addAll(set);
		
		SortedSet<Pelicula> sortedTree = new TreeSet<>(new Comparator<Pelicula>() {
			@Override
			public int compare(Pelicula pelicula1, Pelicula pelicula2) {
				return pelicula1.getFechaEstreno().compareTo(pelicula2.getFechaEstreno());
			}
			
		});
		
		TreeMap<Clave, Pelicula> treeMap = new TreeMap<>();
		for(Pelicula p : set) {
			treeMap.put(p.getClave(), p);
		}
		
		sortedTree.addAll(tree);
		for(Pelicula p : set) {
			System.out.println(p);
		}
		System.out.println();
		for(Pelicula p : tree) {
			System.out.println(p);
		}
		System.out.println();
		for(Pelicula p : sortedTree) {
			System.out.println(p);
		}
		System.out.println();
		for(Clave c : treeMap.keySet()) {
			System.out.println(treeMap.get(c));
		}
		System.out.println(  );
		ListIterator <Pelicula> it;
		ArrayList<Pelicula> treeArray = new ArrayList<Pelicula>(treeMap.values());
		it = treeArray.listIterator();
		while(it.hasNext()) {
			it.next();
		}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}

}
