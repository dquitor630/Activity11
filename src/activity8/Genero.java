package activity8;

public enum Genero {
	FICCION("F"){
		
	},
	TERROR("T"){
		
	},
	COMEDIA("C"){

	};

	

	
	private final String chara;
	
	private Genero(String chara) {
		this.chara = chara;
	}
	
	public String getChara() {
		return chara;
	}
}
