package control;

import gui.GUI;

public class TaskPatio implements Itask{
	Task_Manager manager = new Task_Manager();
	
	@Override
	public void execute(Action pAction, GUI frame) {
		if (pAction==Action.EnviarPlagasInsectos) {
			manager.EnviarPlagasInsectos();
			frame.decirAccion("5", "Enviar plagas de insectos");
		}
		if (pAction==Action.CrecerCesped) {
			manager.CrecerCesped();
			frame.decirAccion("5", "Crece el césped");
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
