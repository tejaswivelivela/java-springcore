package com.teju.spring.sprincore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
private int id;
@Override
public String toString() {
	return "Prescription [id=" + id + ", patientname=" + patientname + ", medicines=" + medicines + "]";
}
public int getId() {
	return id;
}
@Required
public void setId(int id) {
	this.id = id;
}
public String getPatientname() {
	return patientname;
}
public void setPatientname(String patientname) {
	this.patientname = patientname;
}
public List<String> getMedicines() {
	return medicines;
}
public void setMedicines(List<String> medicines) {
	this.medicines = medicines;
}
public String patientname;
private List<String> medicines;
}
