package com.app.builder;

import java.time.LocalDate;
import java.time.Period;

import com.app.dto.UserDTO;
import com.app.dto.UserWebDTO;
import com.app.model.Address;

public class UserWebDTOBuilder implements UserDTOBuilder {
	
	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO dto;

	public UserDTOBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this; 
	}

	public UserDTOBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() + " " + address.getStreet()
		+ "\n" + address.getCity() + " " + address.getState() + " " + address.getZipcode();
		return this;
	}

	public UserDTO build() {
		this.dto = new UserWebDTO(firstName + " " + lastName, address, age);
		return dto;
	}

	public UserDTO getUserDTO() {
		return dto;
	}
	
	
}
