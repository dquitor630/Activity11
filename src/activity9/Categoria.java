package activity9;

public enum Categoria {
	JEFE("J"), ENCARGADO("E"), EMPLEADO("D");

	private final String codigo;

	private Categoria(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
}
