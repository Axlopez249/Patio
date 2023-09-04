package control;

import gui.GUI;
import java.util.ArrayList;

import funcionamiento.*;

public class TaskPatio implements Itask{
	Task_Manager manager;
	ArrayList<Vegetacion> listaElementos;
	
	public TaskPatio(Clase_Padre control, ArrayList<Vegetacion> listaV) {
		manager = new Task_Manager(control);
		listaElementos = listaV;
	}

	@Override
	public void execute(Action pAction, GUI frame) {
		if (pAction==Action.EnviarPlagasInsectos) {
			for (Vegetacion elemento: listaElementos){
				manager.EnviarPlagasInsectos(elemento);
				frame.decirAccion("5", "Enviar plagas de insectos");
			}
			
		}
		if (pAction==Action.CrecerCesped) {
			for(Vegetacion elemento: listaElementos) {
				if (elemento.getClass() == Cesped.class) {
					System.out.println(elemento.getClass().getSimpleName());
					manager.CrecerCesped(elemento);
					frame.decirAccion("5", "Crece el césped");
				}
			}
			
		}
		if (pAction==Action.PasarAguaVentana) {
			manager.PasarAguaVentana();
			frame.decirAccion("5", "Agua pasa por la ventana");
		}
		if (pAction==Action.SituacionPatio) {
			manager.SituacionPatio();
			frame.decirAccion("5", "Se obtiene la situación del patio");
		}
		if (pAction==Action.SaturarSuelo) {
			manager.SaturarSuelo();
			frame.decirAccion("5", "El suelo se satura");
		}
		
		
	}

}
