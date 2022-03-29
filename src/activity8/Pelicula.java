package activity8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Pelicula implements Comparable<Pelicula> {
	private Clave clave;
	private String nombre;
	private LocalDate fechaEstreno;
	private LocalDate fechaDVD;
	
	
	public Pelicula(String nombre, Genero genero, LocalDate
			fechaEstreno, LocalDate fechaDVD){
		this.clave = new Clave(genero);
		this.nombre = nombre;
		this.fechaEstreno = fechaEstreno;
		this.fechaDVD = fechaDVD;
		
		
	}

	public Clave getClave() {
		return clave;
	}

	public void setClave(Clave clave) {
		this.clave = clave;
	}

	public Pelicula copy() {
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clave, fechaDVD, fechaEstreno, nombre);
	}


	@Override
	public String toString() {
		return "Pelicula [clave=" + clave + ", nombre=" + nombre + ", fechaEstreno=" + fechaEstreno + ", fechaDVD="
				+ fechaDVD + "]";
	}

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(clave, other.clave) && Objects.equals(fechaDVD, other.fechaDVD)
				&& Objects.equals(fechaEstreno, other.fechaEstreno) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public int compareTo(Pelicula comparar) {
		long dias = ChronoUnit.DAYS.between(fechaEstreno, fechaDVD);
		long otraPeli = ChronoUnit.DAYS.between(comparar.fechaEstreno, comparar.fechaDVD);
		int comparador = Long.compare(otraPeli, dias);
		if(comparador == 0) {
			comparador = nombre.compareTo(comparar.nombre);
			return (int)comparador;
		}
		return comparador;
	}
}
