package activity9;

public class Clave implements Comparable<Clave> {
	Categoria categoria;
	private int enumeracion;
	private static int contadorJ, contadorE, contadorD;

	public Clave(Categoria categoria) {
		this.categoria = categoria;
		if (categoria == Categoria.JEFE) {
			contadorJ++;
			enumeracion = contadorJ;
		} else if (categoria == Categoria.ENCARGADO) {
			contadorE++;
			enumeracion = contadorE;
		} else {
			contadorD++;
			enumeracion = contadorD;
		}
	}

	public String toString() {
		return categoria.getCodigo() + String.valueOf(enumeracion);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public int compareTo(Clave o) {

		int comparar = o.categoria.compareTo(categoria);
		if (comparar == 0) {
			return comparar = Integer.compare(enumeracion, o.enumeracion);
		}
		return comparar;
	}

}
