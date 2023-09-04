package funcionamiento;
import control.*;

public class Clase_Padre {
	private boolean rain;
	
	public Clase_Padre() {	
	}
	
	public void start() {
		Planta planta1 = new Planta("Helecho", 5);
		Planta planta2 = new Planta("Rosal", 2);
		Suelo suelo = new Suelo(30);
		Cesped cesped = new Cesped(20);
		Arbol arbol1 = new Arbol("Roble", false, 10);
		Arbol arbol2 = new Arbol("Manzano", true, 7);
	}
	
	public void Regar_Plantas(Planta planta) {
		Util.report("Regando la planta");
	}
	
	public void Cortar_Cesped(Cesped cesped) {
		Util.report("Cortando el cesped");
	}
	
	public void Fumigar(){
		Util.report("Fumigando la vegetación");
	}
	
	public void Check_Estatus(){
		Util.report("Revisando el estado del patio");
		
	}
	
	public void Desaturar(){
		Util.report("El suelo se desatura");
	}
	
	public void Saturar(){
		Util.report("El suelo se satura");
	}
	
	public void Pasar_Agua_Ventana(){
		Util.report("El agua pasa por la ventana");
	}
}
