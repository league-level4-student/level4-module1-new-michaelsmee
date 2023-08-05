package _06_Hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	
	ArrayList<Patient> unassignedPatients = new ArrayList<Patient>();
	
	public void addDoctor(Doctor doctor) {
		doctorList.add(doctor);
	}
	
	public void addPatients(Patient patient) {
		unassignedPatients.add(patient);
	}
	
	public ArrayList getpatients() {
		return unassignedPatients;
	}
	
	public ArrayList getDoctors() {
		return doctorList;
	}

	public void assignPatientsToDoctors() {
		for(int i = 0; i < doctorList.size(); i++) {
			for(int x = 0; x<3; x++) {
			doctorList.get(i).assignPatient(unassignedPatients.get(i%x));
		}
		
	}
}
}
