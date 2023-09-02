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
		System.out.println("Creció un centimetro");
		tamano += 1;
	}
	
	public void Ser_Fumigado(){
		fumigado=true;
		System.out.println("Todo está fumigado");
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
