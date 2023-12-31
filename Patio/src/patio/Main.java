package patio;


import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
		Clase_Padre control = new Clase_Padre();
		ArrayList<Vegetacion> elementos = control.start();
		ArrayList<Suelo> elementos_suelo = control.start_suelo();
		TaskPatio manager = new TaskPatio(control, elementos, elementos_suelo);
		GUI frame = new GUI();
		frame.setVisible(true);
		Scheduler myscheduler = new Scheduler(elementos);
		Clock hiloControl = new Clock(myscheduler, frame);
		hiloControl.start();
	}
	
	
}
