package com.dms.evaluation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {

	@Id
	private int appointmentNumber;
	private String doctorName;
	private String department;
	private String appointmentDate;
	private String appointmentTime;
	private String patientName;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int appointmentNumber, String doctorName, String department, String appointmentDate,
			String appointmentTime, String patientName) {
		super();
		this.appointmentNumber = appointmentNumber;
		this.doctorName = doctorName;
		this.department = department;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.patientName = patientName;
	}

	public int getAppointmentNumber() {
		return appointmentNumber;
	}

	public void setAppointmentNumber(int appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public String toString() {
		return "Doctor [appointmentNumber=" + appointmentNumber + ", doctorName=" + doctorName + ", department="
				+ department + ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime
				+ ", patientName=" + patientName + "]";
	}
	
	

}
