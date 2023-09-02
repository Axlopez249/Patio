package funcionamiento;

public class Suelo {
	private int tamaño;
	private boolean saturado;
	
	public Suelo() {
		
	}
	
	public void Saturarse() {
		saturado = true;
	}
	
	public void Desaturarse() {
		saturado = false;
	}
}
