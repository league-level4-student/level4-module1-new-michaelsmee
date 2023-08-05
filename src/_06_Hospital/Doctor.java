package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {

	
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	public void assignPatient(Patient patient) {
		patientList.add(patient);
	
	}
	
	public ArrayList getList() {
		return patientList;
	}


	public void doMedicine() {
		for(int i = 0; i<patientList.size(); i++) {
			patientList.get(i).checkPulse();
		}
	}
	
	public ArrayList getpatients() {
		return patientList;
	}
	
}
