package funcionamiento;

public class Vegetacion {
	protected int tamano;
	protected boolean plaga;
	protected boolean riego;
	protected boolean fumigado=false;
	
	
	//Funciones
	public Vegetacion() {
		
	}
	public void Crecer(){
		tamano += 1;
		Util.report("Creció un centimetro");
	}
	
	public void Ser_Fumigado(){
		fumigado=true;
		Util.report("Todo está fumigado");
	}
	public int getTamano() {
		return tamano;
	}
	public boolean isPlaga() {
		return plaga;
	}
	public boolean isRiego() {
		return riego;
	}
	public boolean isFumigado() {
		return fumigado;
	}
	
}
