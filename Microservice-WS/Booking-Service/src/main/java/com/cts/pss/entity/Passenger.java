package com.cts.pss.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Passenger {

	@Id
	@GeneratedValue
	private int passengerId;
	private String firstName;
	private String lastName;
	private String gender;
	private long mobileNumber;
	private String emailAddress;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "copassengers", joinColumns = { @JoinColumn(name = "passengerId") }, inverseJoinColumns = {
			@JoinColumn(name = "copassengerId") })
	private List<Co_Passenger> co_Passengers;

	public List<Co_Passenger> getCo_Passengers() {
		return co_Passengers;
	}

	public void setCo_Passengers(List<Co_Passenger> co_Passengers) {
		this.co_Passengers = co_Passengers;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}