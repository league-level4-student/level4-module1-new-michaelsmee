package _06_Hospital;

public class Patient {
	
	public boolean caredFor;
	
	public boolean feelsCaredFor(){
			return caredFor;
		}
	
	public void checkPulse() {
		caredFor = true;
	}
}
