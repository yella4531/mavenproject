package com.slokam.healthcare.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class Appointment implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
@OneToOne 
@JoinColumn(name="fkid18") 
  private Patient  patient;
  private Date  dateAndTime;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public Patient getPatient() {
		return patient;
	}
public void setPatient(Patient patient) {
		this.patient = patient;
	}
public Date getDateAndTime() {
		return dateAndTime;
	}
public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
}