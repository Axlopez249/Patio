package schedule;

import timer.Clock;
import gui.GUI;
import funcionamiento.*;

import java.util.ArrayList;

import control.*;

public class Main {

	
	public static void main(String[] args) {
		
		Clase_Padre control = new Clase_Padre();
		ArrayList<Vegetacion> elementos = control.start();
		GUI frame = new GUI();
		frame.setVisible(true);
		Scheduler myscheduler = new Scheduler();
		Clock hiloControl = new Clock(myscheduler);
		hiloControl.start();
		myscheduler.processTasks(frame);
		TaskPatio manager = new TaskPatio(control, elementos);
		manager.execute(Action.CrecerCesped, frame);
	}
	
	
}
