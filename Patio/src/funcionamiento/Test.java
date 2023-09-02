package funcionamiento;

import java.util.Date;

public class Test {
	private Date hora;
	private Itask task;
	private Action action;
	
	public Test(Date pTime, Itask task, Action pAction) {
		this.hora = pTime;
		this.task = task;
		this.action = pAction;
	}

	public Date getHora() {
		return hora;
	}

	public Itask getTask() {
		return task;
	}

	public Action getAction() {
		return action;
	}
	
}
