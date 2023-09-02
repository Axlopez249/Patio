package funcionamiento;

public class TaskPatio implements Itask{
	Task_Manager manager = new Task_Manager();
	
	@Override
	public void execute(Action pAction) {
		if (pAction==Action.EnviarPlagasInsectos) {
			manager.EnviarPlagasInsectos();
		}
		if (pAction==Action.CrecerCesped) {
			manager.CrecerCesped();
		}
		if (pAction==Action.PasarAguaVentana) {
			manager.PasarAguaVentana();
		}
		if (pAction==Action.SituacionPatio) {
			manager.SituacionPatio();
		}
		if (pAction==Action.SaturarSuelo) {
			manager.SaturarSuelo();
		}
		
		
	}
}
