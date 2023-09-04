package schedule;

import timer.Clock;
import gui.GUI;
import funcionamiento.*;
import control.*;

public class Main {

	
	public static void main(String[] args) {
		Clase_Padre control = new Clase_Padre();
		control.start();
		GUI frame = new GUI();
		frame.setVisible(true);
		Scheduler myscheduler = new Scheduler();
		myscheduler.processTasks(frame);
		Clock hiloControl = new Clock(myscheduler);
		hiloControl.start();
		TaskPatio manager = new TaskPatio();
		manager.execute(Action.EnviarPlagasInsectos, frame);
	}
	
	
}
