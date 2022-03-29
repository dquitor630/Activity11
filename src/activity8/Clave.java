package activity8;

public class Clave implements Comparable<Clave>{
	private Genero genero;
	private  int enumeracion;
	private static int contadorC, contadorF, contadorT;
	
	
	public Clave(Genero genero) {
		this.genero = genero;
		if(genero == Genero.COMEDIA) {
			contadorC++;
			this.enumeracion = contadorC;
		}else if(genero == Genero.FICCION) {
			contadorF++;
			this.enumeracion = contadorF;
		}else if(genero == Genero.TERROR) {
			contadorT++;
			this.enumeracion = contadorT;
		}
	}
	
	
	public String toString() {
		return genero + String.valueOf(enumeracion);
	}
	


	@Override
	public int compareTo(Clave clave) {
		int comparar = genero.compareTo(clave.genero);
		if (comparar == 0) {
			return comparar = Integer.compare(enumeracion, clave.enumeracion);
		}
		return comparar;
	}





}
