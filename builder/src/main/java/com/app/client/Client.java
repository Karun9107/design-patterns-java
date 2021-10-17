package com.app.client;

import java.time.LocalDate;

import com.app.builder.UserDTOBuilder;
import com.app.builder.UserWebDTOBuilder;
import com.app.dto.UserDTO;
import com.app.model.Address;
import com.app.model.User;

public class Client {
	
	public static void main(String[] args) {
		System.out.println(buildDirector(new UserWebDTOBuilder(), new User()));
	}
	
	private static UserDTO buildDirector(UserDTOBuilder builder, User user) {
		Address address = new Address();
		address.setHouseNumber("1/12");
		address.setStreet("Shiganshina");
		address.setCity("Wall Maria");
		address.setState("Paradis");
		address.setZipcode("12121");
		return builder.withFirstName("Eren").withLastName("Yeager").withBirthday(LocalDate.of(2000, 10, 10)).withAddress(address).build();
	}

}
