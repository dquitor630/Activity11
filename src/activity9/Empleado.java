package activity9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Empleado implements Comparable<Empleado> {

	private Clave clave;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	private LocalDate fechaAlta;
	private LocalDate fechaBaja;

	public Empleado(String nombre, Categoria categoria, LocalDate fechaAlta, LocalDate fechaBaja) {
		this.nombre = nombre;
		this.clave = new Clave(categoria);
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
	}

	public Empleado copy() {
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clave, fechaAlta, fechaBaja, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(clave, other.clave) && Objects.equals(fechaAlta, other.fechaAlta)
				&& Objects.equals(fechaBaja, other.fechaBaja) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Empleado o) {
		LocalDate baja;
		long dias;
		Long diasOtro;
		if (fechaBaja == null) {
			baja = LocalDate.now();
		} else {
			baja = fechaBaja;
		}
		if (o.fechaBaja == null) {
			diasOtro = ChronoUnit.DAYS.between(o.fechaAlta, LocalDate.now());
		} else {
			diasOtro = ChronoUnit.DAYS.between(o.fechaAlta, o.fechaBaja);
		}

		dias = ChronoUnit.DAYS.between(fechaAlta, baja);
		int comparador = Long.compare(diasOtro, dias);
		return comparador;

	}

	@Override
	public String toString() {
		long diasTrabajados;
		if (fechaBaja == null) {
			diasTrabajados = ChronoUnit.DAYS.between(fechaAlta, LocalDate.now());
		} else {
			diasTrabajados = ChronoUnit.DAYS.between(fechaAlta, fechaBaja);
		}
		return clave.getCategoria() + " Nombre: " + nombre + " Clave: " + clave + " Fecha alta: " + fechaAlta
				+ " Fecha baja" + fechaBaja + " Días trabajados: " + diasTrabajados;
	}

	public Clave getClave() {

		return clave;
	}

}
