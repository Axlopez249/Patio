package funcionamiento;

public class Suelo {
	private int tamano;
	private boolean saturado=false;
	
	public Suelo(int pSize) {
		tamano = pSize;
	}
	
	public void Saturarse() {
		saturado = true;
	}
	
	public void Desaturarse() {
		saturado = false;
	}
}
