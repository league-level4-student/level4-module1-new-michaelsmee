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
	
	public ArrayList<Patient> getpatients() {
		return unassignedPatients;
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctorList;
	}

	public void assignPatientsToDoctors() {
		
		int y = 0;
		
		while(unassignedPatients.size() > 0) {
			try {
				doctorList.get(y).assignPatient(unassignedPatients.get(0));
				unassignedPatients.remove(0);
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				y++;
				
				
			}
			
			
		
		}
		
}
}
