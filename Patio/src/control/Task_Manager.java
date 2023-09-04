package control;

import funcionamiento.*;

public class Task_Manager {
	public Clase_Padre control;
	public Task_Manager(Clase_Padre pControl) {
		control = pControl;
	}
	public void EnviarPlagasInsectos(Vegetacion elemento) {
		Util.report("Se envian plagas al patio");
		control.EnviarPlaga(elemento);
	}
	
	public void CrecerCesped(Vegetacion cesped) {
		Util.report("El cesped crece");
		control.Crecer_Cesped(cesped);
	}
	
	public void SaturarSuelo() {
		Util.report("Se satura el suelo");
		
	}
	
	public void SituacionPatio() {
		Util.report("Se obtiene la situacion del patio");
		
	}
	
	public void PasarAguaVentana() {
		Util.report("El agua pasa por la ventana");
		
	}
}
